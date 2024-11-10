package software.ulpgc.kata3.architecture.control;

import software.ulpgc.kata3.architecture.io.BarchartLoader;

import java.io.IOException;

import software.ulpgc.kata3.architecture.view.SelectStatisticDialog;
import software.ulpgc.kata3.architecture.view.BarchartDisplay;

public class SelectStatisticCommand implements Command {
    private final SelectStatisticDialog dialog;
    private final BarchartLoader loader;
    private final BarchartDisplay display;

    public SelectStatisticCommand(SelectStatisticDialog dialog, BarchartLoader loader, BarchartDisplay display) {
        this.dialog = dialog;
        this.loader = loader;
        this.display = display;
    }

    @Override
    public void execute() throws IOException{
        display.show(loader.load(dialog.getSelection()));
    }
}