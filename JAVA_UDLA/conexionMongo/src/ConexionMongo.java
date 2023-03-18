
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.UnknownHostException;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.text.Document;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMongo {

    DB BasedeDatos;
    DBCollection coleccion;
    BasicDBObject documentos = new BasicDBObject();
    JFileChooser dlg;
    String imagen = null;

    public ConexionMongo() {
        try {
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            BasedeDatos = mongo.getDB("BImagenes");
            coleccion = BasedeDatos.getCollection("imagenes");
            System.out.println("Conexion exitosa a MONGO");
        } catch (UnknownHostException e) {
            System.out.println("Conexion fallida a MONGO" + e);
        }
    }

    public boolean actualizar(String nom, String cedula) {
        eliminar(cedula);
        Mon(nom, cedula);
        return true;
    }

    public boolean insertar(String accion, String cedula) {
        try {
            documentos.put("Cedula", cedula);
            documentos.put("Foto_persona", accion);
            coleccion.insert(documentos);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void Mon(String nom, String cedula) {
        StringBuilder path = new StringBuilder();
        path.append(nom);
        String imageBase64 = null;
        byte[] base64EncodedImage = null;
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            base64EncodedImage = loadImage64(path.toString());
            if (base64EncodedImage != null) {
                imageBase64 = encoder.encodeBuffer(base64EncodedImage);
                if (imageBase64 != null && !imageBase64.trim().equals("")) {
                    insertar(imageBase64, cedula);
                    System.out.println("ARCHIVOS REGISTRADOS");
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static byte[] loadImage64(String url) throws Exception {
        File file = new File(url.toString());
        if (file.exists()) {
            int lenght = (int) file.length();
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[lenght];
            reader.read(bytes, 0, lenght);
            reader.close();
            return bytes;
        } else {
            System.out.println("Recurso no encontrado");
            return null;
        }
    }

    public String ConsultarImagen(String identificacion) {
        DBObject query = new BasicDBObject("Cedula", new BasicDBObject("$regex", identificacion));
        DBCollection col = BasedeDatos.getCollection("imagenes");
        DBCursor cur2 = col.find(query);
        try {

            while (cur2.hasNext()) {
                imagen = (String) cur2.next().get("Foto_persona");
            }
            cur2.close();

        } catch (Exception e) {
        }
        System.out.println(imagen);
        return imagen;
    }

    public BufferedImage decodeToImage(String imageString) {
        System.out.println("Cambiando...");
        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Realizado...");
        return image;
    }

    public void mostrar() {
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public boolean eliminar(String cedula) {
        documentos.put("Cedula", cedula);
        coleccion.remove(documentos);
        return true;
    }
}
