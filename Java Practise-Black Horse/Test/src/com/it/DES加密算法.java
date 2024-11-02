import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DES加密算法 {

  // 方法：生成一个DES密钥
  public static SecretKey generateDESKey() throws Exception {
    // 使用DES算法生成密钥
    KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
    keyGenerator.init(56); // 设置密钥长度为56位
    return keyGenerator.generateKey();
  }

  // 方法：用DES密钥加密文本
  public static String encryptDES(String plainText, SecretKey secretKey) throws Exception {
    // 创建DES Cipher对象
    Cipher cipher = Cipher.getInstance("DES");
    // 初始化为加密模式
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    // 执行加密
    byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
    // 返回加密后的文本（使用Base64编码便于显示）
    return Base64.getEncoder().encodeToString(encryptedBytes);
  }

  // 方法：用DES密钥解密文本
  public static String decryptDES(String encryptedText, SecretKey secretKey) throws Exception {
    // 创建DES Cipher对象
    Cipher cipher = Cipher.getInstance("DES");
    // 初始化为解密模式
    cipher.init(Cipher.DECRYPT_MODE, secretKey);
    // 执行解密
    byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
    byte[] decryptedBytes = cipher.doFinal(decodedBytes);
    // 返回解密后的明文
    return new String(decryptedBytes);
  }

  public static void main(String[] args) throws Exception {
    String text = "使用DES加密王宇的名字";

    // 生成DES密钥
    SecretKey desKey = generateDESKey();
    System.out.println("DES Key: " + Base64.getEncoder().encodeToString(desKey.getEncoded()));

    // 加密
    String encryptedText = encryptDES(text, desKey);
    System.out.println("Encrypted Text: " + encryptedText);

    // 解密
    String decryptedText = decryptDES(encryptedText, desKey);
    System.out.println("Decrypted Text: " + decryptedText);
  }
}
