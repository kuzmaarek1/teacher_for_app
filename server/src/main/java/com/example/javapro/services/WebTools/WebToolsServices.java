package com.example.javapro.services.WebTools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.example.javapro.model.WebTools.WebTools;
import com.example.javapro.repository.WebTools.WebToolsRepository;

@Component
public class WebToolsServices {
    @Autowired
    private WebToolsRepository webToolsRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void run() throws Exception {
        /*
        Integer countList = new File("img/webTools").listFiles().length;
        List<File> file = new ArrayList<File>();
        List <byte[]> picInBytes = new ArrayList<byte[]>();
        List <FileInputStream> fileInputStream  = new ArrayList<FileInputStream>();
        for (int i = 0; i < countList; i++) {
            file.add(new File("img/webTools/0"+i+".png"));

            picInBytes.add(new byte[(int) file.get(i).length()]);
            fileInputStream.add(new FileInputStream(file.get(i)));
            fileInputStream.get(i).read(picInBytes.get(i));
            fileInputStream.get(i).close();
        }

        List <WebTools> webTools = new ArrayList<WebTools>();
        webTools.add(new WebTools("Java SWING",
                "Swing to zestaw narzędzi z widgetami GUI dla języka Java. Jest częścią Oracle jest Foundation Java klas (Jfc) - w API do dostarczania graficzny interfejs użytkownika (GUI) pakietu programów Java.Swing został opracowany, aby zapewnić bardziej wyrafinowany zestaw komponentów GUI niż wcześniejszy Abstract Window Toolkit (AWT).",
                "https://docs.oracle.com/javase/tutorial/uiswing/index.html",
                picInBytes.get(0)));
        webTools.add(new WebTools("Java FX",
                "Rodzina technologii i produktów firmy Sun Microsystems, przeznaczonych głównie do tworzenia Rich Internet Application. W skład JavaFX wchodzi język skryptowy JavaFX Script oraz system dla urządzeń mobilnych Java ME.",
                "https://openjfx.io/javadoc/15/",
                picInBytes.get(1)));
        webTools.add(new WebTools("Java Android",
                "Zestaw narzędzi (SDK) dla programistów przeznaczony do tworzenia aplikacji na platformę Android. Składa się z dwóch części: SDK Tools – wymaganej do tworzenia aplikacji niezależnie od wersji Androida, oraz Platform Tools – czyli narzędzi zmodyfikowanych pod kątem konkretnych wersji systemu.",
                "https://developer.android.com/guide",
                picInBytes.get(2)));
        webTools.add(new WebTools("Java EE Platform",
                "Jest szeroko rozpowszechnioną serwerową platformą programistyczną języka Java. Definiuje standard tworzenia aplikacji w języku programowania Java opartych o wielowarstwową architekturę komponentową. Komponenty są zwykle osadzane na serwerze aplikacyjnym obsługującym Java Enterprise.",
                "https://www.oracle.com/pl/java/technologies/java-ee-glance.html",
                null));
        webTools.add(new WebTools("Spring",
                "Szkielet tworzenia aplikacji w języku Java dla platformy Java Platform, Enterprise Edition. Spring Framework powstał na bazie kodu opublikowanego w książce Roda Johnsona Design and Development. ",
                "https://spring.io/",
                picInBytes.get(3)));

        for(int i=0;i<webTools.size();i++){
            this.webToolsRepository.save(webTools.get(i));
        }
*/
    }
}
