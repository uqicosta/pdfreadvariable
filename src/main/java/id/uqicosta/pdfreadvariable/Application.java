package id.uqicosta.pdfreadvariable;

import java.util.Map;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;

public class Application {
	public static void main(String[] args) throws Exception {
		PdfReader reader = new PdfReader( "D:\\tmp\\Form_Aplikasi_Karyawan_PT_Surya_Madistrindo_edit2.pdf" );
		PdfDocument document = new PdfDocument(reader);
		PdfAcroForm acroForm = PdfAcroForm.getAcroForm(document, false);
		Map<String,PdfFormField> fields = acroForm.getFormFields();
		for (String fldName : fields.keySet()) {
		  System.out.println( fldName + ": " + fields.get( fldName ).getValueAsString() );
		}
		document.close();
		reader.close();
	}
}
