package a6;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.app.sdksandbox.sdkprovider.SdkSandboxController;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ Class B() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager j(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder k() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Topic o(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController p(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return SdkSandboxController.class;
    }
}
