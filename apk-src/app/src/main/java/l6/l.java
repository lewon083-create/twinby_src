package l6;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f27988a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f27989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r6.f f27990c;

    public l(g gVar) {
        this.f27989b = gVar;
    }

    public final r6.f a() {
        this.f27989b.a();
        if (!this.f27988a.compareAndSet(false, true)) {
            String strB = b();
            g gVar = this.f27989b;
            gVar.a();
            gVar.b();
            return new r6.f(((SQLiteDatabase) gVar.f27969c.getWritableDatabase().f32252c).compileStatement(strB));
        }
        if (this.f27990c == null) {
            String strB2 = b();
            g gVar2 = this.f27989b;
            gVar2.a();
            gVar2.b();
            this.f27990c = new r6.f(((SQLiteDatabase) gVar2.f27969c.getWritableDatabase().f32252c).compileStatement(strB2));
        }
        return this.f27990c;
    }

    public abstract String b();

    public final void c(r6.f fVar) {
        if (fVar == this.f27990c) {
            this.f27988a.set(false);
        }
    }
}
