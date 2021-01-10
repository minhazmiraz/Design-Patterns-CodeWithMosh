package com.codewithmosh;

import com.codewithmosh.command.*;
import com.codewithmosh.command.History;
import com.codewithmosh.iterator.Iterator;
import com.codewithmosh.iterator.Product;
import com.codewithmosh.iterator.ProductCollection;
import com.codewithmosh.memento.*;
import com.codewithmosh.state.DirectionService;
import com.codewithmosh.state.TravelTypeDriving;
import com.codewithmosh.state.TravelTypeTransit;
import com.codewithmosh.strategy.*;
import com.codewithmosh.template.SublimeTextWindow;
import com.codewithmosh.template.VsCodeWindow;
import com.codewithmosh.template.Window;

public class Main {

    public static void main(String[] args) {
    // write your code here

        //Memento
        /*
        var msWord = new Document("a", "sans-serif", 12);
        var msWordHistory = new History();

        msWordHistory.push(msWord.CreateState());

        msWord.setContent("b");
        msWordHistory.push(msWord.CreateState());
        
        msWord.setFontName("sans");
        msWord.restore(msWordHistory.pop());
        
        System.out.println(msWord);
        */

        //Strategy
        /*ChatClient chatClient = new ChatClient(new AESEncryptionAlgorithm());
        chatClient.send("Hello World");

        ChatClient chatClient1 = new ChatClient(new AESEncryptionAlgorithm());
        chatClient1.send("Bye World");*/

        /*ChatClient chatClient = new ChatClient();
        chatClient.send("Hello World", new AESEncryptionAlgorithm());
        chatClient.send("Bye World", new DESEncryptionAlgorithm());*/

        //State
        /*DirectionService directionService = new DirectionService(new TravelTypeDriving());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new TravelTypeTransit());
        directionService.getEta();
        directionService.getDirection();*/

        //Iterator
        /*ProductCollection productCollection = new ProductCollection();
        productCollection.push(new Product(1, "a"));
        productCollection.push(new Product(2, "b"));
        productCollection.push(new Product(3, "c"));

        Iterator iterator = productCollection.createIterator();
        while(iterator.hasNext()){
            Product product = iterator.current();
            System.out.println(product);
            iterator.next();
        }*/

        //Template
        /*Window sublimeTextWindow = new SublimeTextWindow();
        Window vsCodeWindow = new VsCodeWindow();

        sublimeTextWindow.close();
        vsCodeWindow.close();*/

        //Command
        VideoEditor videoEditor = new VideoEditor();
        History history = new History();
        UndoCommand undoCommand = new UndoCommand(history);
        System.out.println(videoEditor);

        LabelCommand labelCommand = new LabelCommand(history, "Mark my word", videoEditor);
        labelCommand.execute();
        System.out.println(videoEditor);

        ContrastCommand contrastCommand = new ContrastCommand(history, 1.5f, videoEditor);
        contrastCommand.execute();
        System.out.println(videoEditor);

        labelCommand = new LabelCommand(history, "Hello World", videoEditor);
        labelCommand.execute();
        System.out.println(videoEditor);

        contrastCommand = new ContrastCommand(history, 5.5f, videoEditor);
        contrastCommand.execute();
        System.out.println(videoEditor);

        undoCommand.execute();
        System.out.println(videoEditor);

        undoCommand.execute();
        System.out.println(videoEditor);

        undoCommand.execute();
        System.out.println(videoEditor);

        undoCommand.execute();
        System.out.println(videoEditor);

    }
}
