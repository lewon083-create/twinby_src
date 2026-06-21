package e8;

import android.location.Location;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import g8.p;
import hi.g;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ri.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements f8.a, p, OnCompleteListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f16294c;

    public /* synthetic */ e(g gVar, int i) {
        this.f16293b = i;
        this.f16294c = gVar;
    }

    @Override // g8.p
    public void a(Location location) {
        this.f16294c.success(h5.F(location));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f16293b) {
            case 6:
                Intrinsics.checkNotNullParameter(task, "task");
                boolean zIsSuccessful = task.isSuccessful();
                g gVar = this.f16294c;
                if (!zIsSuccessful) {
                    gVar.success(Boolean.FALSE);
                } else {
                    gVar.success(Boolean.TRUE);
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(task, "it");
                this.f16294c.success(null);
                break;
            case 8:
                boolean zIsSuccessful2 = task.isSuccessful();
                g gVar2 = this.f16294c;
                if (!zIsSuccessful2) {
                    Exception exception = task.getException();
                    String message = exception != null ? exception.getMessage() : null;
                    HashMap map = new HashMap();
                    map.put("code", "unknown");
                    if (exception != null) {
                        map.put("message", exception.getMessage());
                    } else {
                        map.put("message", "An unknown error has occurred.");
                    }
                    gVar2.b("firebase_messaging", message, map);
                } else {
                    gVar2.success(task.getResult());
                }
                break;
            default:
                g gVar3 = this.f16294c;
                Intrinsics.checkNotNullParameter(task, "completedTask");
                try {
                    Boolean bool = (Boolean) task.g(na.d.class);
                    if (bool != null) {
                        gVar3.success(bool);
                    }
                } catch (na.d e3) {
                    gVar3.b("GooglePayError", e3.getMessage(), null);
                }
                break;
        }
    }

    @Override // f8.a
    public void onError(int i) {
        switch (this.f16293b) {
            case 1:
                this.f16294c.b(om1.b(i), om1.a(i), null);
                break;
            default:
                this.f16294c.b(om1.b(i), om1.a(i), null);
                break;
        }
    }

    public /* synthetic */ e(f fVar, g gVar) {
        this.f16293b = 8;
        this.f16294c = gVar;
    }
}
