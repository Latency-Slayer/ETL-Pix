package school.sptech;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CsvWriter {
    public ByteArrayOutputStream writeCsv(List<Pix> pix) throws IOException {
        // Criar um CSV em memória utilizando ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("AnoMes", "PAG_PFPJ", "REC_PFPJ", "PAG_REGIÃO", "REC_REGIÃO", "PAG_IDADE", "REC_IDADE", "FORMA_INICIAÇÃO", "NATUREZA", "FINALIDADE", "VALOR", "QUANTIDADE"));

        // Processar e escrever cada objeto no CSV
        for (Pix p : pix) {
            csvPrinter.printRecord(
                    p.anoMes(),
                    p.getPAG_PFPJ(),
                    p.getREC_PFPJ(),
                    p.getPAG_REGIAO(),
                    p.getREC_REGIAO(),
                    p.getFORMA_INICIACAO(),
                    p.getNATUREZA(),
                    p.getFINALIDADE(),
                    p.getVALOR(),
                    p.getQUANTIDADE()
            );
        }

        // Fechar o CSV para garantir que todos os dados sejam escritos
        csvPrinter.flush();
        writer.close();

        // Retornar o ByteArrayOutputStream que contém o CSV gerado
        return outputStream;
    }
}
