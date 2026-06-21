package la;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements sb.a, sb.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f28071c = new d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f28072d = new d(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d f28073e = new d(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28074b;

    public /* synthetic */ d(int i) {
        this.f28074b = i;
    }

    @Override // sb.f
    public Task c(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f28061h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? b4.s(bundle) : b4.s(null);
    }

    @Override // sb.a
    public Object g(Task task) throws IOException {
        switch (this.f28074b) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
