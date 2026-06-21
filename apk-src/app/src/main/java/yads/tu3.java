package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z92 f43442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43443b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f43444c = new ArrayList();

    public tu3(Context context) {
        this.f43442a = z92.f45285g.a(context);
    }

    public final void a(od3 od3Var) {
        synchronized (this.f43443b) {
            this.f43444c.add(od3Var);
            this.f43442a.b(od3Var);
            Unit unit = Unit.f27471a;
        }
    }
}
