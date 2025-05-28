package oops.abstraction.interfacexample;

public class WebsiteBuilderMain {
    public static void main(String[] args) {
//        PHPWebsiteBuilder websiteBuilder=new JavaWebsiteBuilder();
//        websiteBuilder.createWebsite();

        // Type variableName = new ImplementationClass()
        WebsiteBuilder websiteBuilder= new PHPWebsiteBuilder();
        websiteBuilder.createWebsite();

        websiteBuilder=new JavaWebsiteBuilder();
        websiteBuilder.createWebsite();



        /*


        doing this makes dependent on JavaWebsiteBuilder class
        not will not be able to change object in future

        JavaWebsiteBuilder builder=new JavaWebsiteBuilder();
        builder=new PHPWebsiteBuilder();
        */
    }
}
