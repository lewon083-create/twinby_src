package s3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.jw1;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f32548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32549c;

    public g(Context context) {
        this.f32547a = context;
        this.f32548b = new a4.b(context, (byte) 0);
    }

    public final a[] a(Handler handler, t tVar, t tVar2, t tVar3, t tVar4) {
        ArrayList arrayList = new ArrayList();
        boolean z5 = this.f32549c;
        Context context = this.f32547a;
        o4.g gVar = new o4.g(context);
        a4.b bVar = this.f32548b;
        gVar.f29616c = bVar;
        gVar.f29617d = 5000L;
        gVar.f29618e = z5;
        gVar.f29619f = handler;
        gVar.f29620g = tVar;
        gVar.f29621h = 50;
        h5.r(!gVar.f29615b);
        Handler handler2 = gVar.f29619f;
        h5.r((handler2 == null && gVar.f29620g == null) || !(handler2 == null || gVar.f29620g == null));
        gVar.f29615b = true;
        arrayList.add(new o4.i(gVar));
        jw1 jw1Var = new jw1(context, 2);
        h5.r(!jw1Var.f6955b);
        jw1Var.f6955b = true;
        if (((bb.e) jw1Var.f6957d) == null) {
            jw1Var.f6957d = new bb.e(new k3.k[0]);
        }
        if (((u3.s) jw1Var.f6959f) == null) {
            if (((r3.b) jw1Var.f6960g) == null) {
                jw1Var.f6960g = new r3.b(context);
            }
            if (((u3.z) jw1Var.f6958e) == null) {
                jw1Var.f6958e = u3.z.f34242a;
            }
            com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
            yVar.f14899b = context != null ? context.getApplicationContext() : null;
            yVar.f14901d = u3.z.f34242a;
            if (context == null) {
                yVar.f14902e = u3.b.f34071c;
            }
            u3.b bVar2 = context != null ? null : (u3.b) jw1Var.f6956c;
            Context context2 = (Context) yVar.f14899b;
            if (context2 == null) {
                yVar.f14902e = bVar2;
            }
            r3.b bVar3 = (r3.b) jw1Var.f6960g;
            yVar.f14900c = bVar3;
            yVar.f14901d = (u3.z) jw1Var.f6958e;
            if (bVar3 == null) {
                yVar.f14900c = new r3.b(context2);
            }
            jw1Var.f6959f = new u3.s(yVar);
        } else {
            h5.r(((r3.b) jw1Var.f6960g) == null);
            h5.r(((u3.z) jw1Var.f6958e) == null);
        }
        arrayList.add(new u3.a0(this.f32547a, bVar, this.f32549c, handler, tVar2, new u3.y(jw1Var)));
        arrayList.add(new k4.e(tVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new c4.b(tVar4, looper));
        arrayList.add(new c4.b(tVar4, looper));
        arrayList.add(new p4.a());
        arrayList.add(new a4.h(new a4.b(context, 0)));
        return (a[]) arrayList.toArray(new a[0]);
    }
}
