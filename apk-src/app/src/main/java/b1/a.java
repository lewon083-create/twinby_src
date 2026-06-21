package b1;

import a1.k;
import android.graphics.Insets;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import j0.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static AudioRecordingConfiguration a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static Insets c(int i, int i10, int i11, int i12) {
        return Insets.of(i, i10, i11, i12);
    }

    public static void d(AudioRecord audioRecord, i iVar, k kVar) {
        audioRecord.registerAudioRecordingCallback(iVar, kVar);
    }

    public static void e(AudioRecord audioRecord, k kVar) {
        audioRecord.unregisterAudioRecordingCallback(kVar);
    }
}
