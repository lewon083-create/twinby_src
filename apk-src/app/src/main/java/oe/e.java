package oe;

import com.google.gson.internal.Excluder;
import java.io.IOException;
import me.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f30646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.k f30649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.reflect.a f30650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Excluder f30651f;

    public e(Excluder excluder, boolean z5, boolean z10, me.k kVar, com.google.gson.reflect.a aVar) {
        this.f30651f = excluder;
        this.f30647b = z5;
        this.f30648c = z10;
        this.f30649d = kVar;
        this.f30650e = aVar;
    }

    @Override // me.w
    public final Object a(re.b bVar) throws re.d {
        if (this.f30647b) {
            bVar.skipValue();
            return null;
        }
        w wVarE = this.f30646a;
        if (wVarE == null) {
            wVarE = this.f30649d.e(this.f30651f, this.f30650e);
            this.f30646a = wVarE;
        }
        return wVarE.a(bVar);
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        if (this.f30648c) {
            cVar.i();
            return;
        }
        w wVarE = this.f30646a;
        if (wVarE == null) {
            wVarE = this.f30649d.e(this.f30651f, this.f30650e);
            this.f30646a = wVarE;
        }
        wVarE.b(cVar, obj);
    }
}
