/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileconverter;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;
import com.aspose.pdf.HtmlSaveOptions;
import com.aspose.pdf.LettersPositioningMethods;

/**
 *
 * @author pc
 */
public class FileConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HtmlToPdf();
        PdfToHtml();
    }
    
    
    public static void HtmlToPdf()
    {
    // Create HTML load options
HtmlLoadOptions htmloptions = new HtmlLoadOptions(); 		 
// Load HTML file
Document doc = new Document("C:\\Web Templates\\smart_shop\\web\\index.html", htmloptions); 
// Convert HTML file to PDF
doc.save("C:\\Web Templates\\smart_shop\\web\\index.pdf");
    }
    
    
    public static void PdfToHtml()
    {

Document doc = new Document("C:\\Users\\pc\\Downloads\\PACKAGES.pdf");
// Instantiate HTML Save options object
HtmlSaveOptions newOptions = new HtmlSaveOptions();

// Enable option to embed all resources inside the HTML
newOptions.PartsEmbeddingMode = HtmlSaveOptions.PartsEmbeddingModes.EmbedAllIntoHtml;

// This is just optimization for IE and can be omitted
newOptions.LettersPositioningMethod = LettersPositioningMethods.UseEmUnitsAndCompensationOfRoundingErrorsInCss;
newOptions.RasterImagesSavingMode = HtmlSaveOptions.RasterImagesSavingModes.AsEmbeddedPartsOfPngPageBackground;
newOptions.FontSavingMode = HtmlSaveOptions.FontSavingModes.SaveInAllFormats;
// Output file path
String outHtmlFile = "C:\\Web Templates\\smart_shop\\web\\PACKAGES.html";
// Save the output file
doc.save(outHtmlFile, newOptions);
    }
    
}
