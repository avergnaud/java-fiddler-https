public class Main {
    public static void main(String[] args) {

        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");
        System.setProperty("https.proxyPort", "8888");

        /* FiddlerRoot.cer was added to windows trust store */
        System.setProperty("javax.net.ssl.trustStoreType","Windows-ROOT");

        new HttpsClient().testIt("https://example.com/");
    }
}
