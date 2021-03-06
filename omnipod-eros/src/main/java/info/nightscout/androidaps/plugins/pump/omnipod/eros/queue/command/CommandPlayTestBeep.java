package info.nightscout.androidaps.plugins.pump.omnipod.eros.queue.command;

import info.nightscout.androidaps.plugins.pump.omnipod.eros.driver.definition.BeepConfigType;

public class CommandPlayTestBeep extends OmnipodCustomCommand {
    private final BeepConfigType beepType;

    public CommandPlayTestBeep(BeepConfigType beepType) {
        super(OmnipodCustomCommandType.PLAY_TEST_BEEP);
        this.beepType = beepType;
    }

    public BeepConfigType getBeepType() {
        return beepType;
    }
}
