package ro.itschool.Curs13.InTheClass;

import java.io.IOException;

public class MainDocument {
    public static void main(String[] args) throws IOException {


        //     DocSource docSource=new MemoryDocSource();
        DocSource docSource = new FileLineDocSource("src/main/resources/doc.in");
        System.out.println(docSource.getDocuments());
        testDocumentService(docSource);

        DocSource docSource1 = new FileSplitDocSource("src/main/resources/doc-split.in");
        testDocumentService(docSource1);


    }

    private static void testDocumentService(DocSource docSource) {
        DocumentService service = new DocumentService(docSource.getDocuments());
        System.out.println(service.getAllDocuments());

        service.addMarkupForDocuments(new Markup("1a2", 4, "Content1"), "4fc41cc8-c061-4dc4-bd66-de0b328929ed");
        System.out.println(service.getMarkupsForDocument("4fc41cc8-c061-4dc4-bd66-de0b328929ed"));
    }
}
