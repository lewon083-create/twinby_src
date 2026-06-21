package i8;

import android.content.Context;
import fh.nd;
import fh.zf;
import h3.e;
import ii.q;
import java.util.HashSet;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f21214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f21215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fi.b f21216d;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        h3 h3Var = (h3) bVar;
        w wVar = (w) h3Var.f28250b;
        b bVar2 = this.f21214b;
        if (bVar2 != null) {
            bVar2.f21219d = wVar;
        }
        this.f21216d = bVar;
        h3Var.a(bVar2);
        ((h3) this.f21216d).b(this.f21214b);
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        Context context = aVar.f16381a;
        this.f21214b = new b(context);
        q qVar = new q(aVar.f16383c, "flutter.baseflow.com/permissions/methods");
        this.f21215c = qVar;
        qVar.b(new e(context, new zf(), this.f21214b, new nd()));
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        b bVar = this.f21214b;
        if (bVar != null) {
            bVar.f21219d = null;
        }
        fi.b bVar2 = this.f21216d;
        if (bVar2 != null) {
            ((h3) bVar2).g(bVar);
            fi.b bVar3 = this.f21216d;
            ((HashSet) ((h3) bVar3).f28252d).remove(this.f21214b);
        }
        this.f21216d = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f21215c.b(null);
        this.f21215c = null;
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        onAttachedToActivity(bVar);
    }
}
