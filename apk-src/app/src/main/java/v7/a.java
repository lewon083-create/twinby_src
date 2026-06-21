package v7;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m7.l f34753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f34754d;

    public a(m7.l lVar, UUID uuid) {
        this.f34753c = lVar;
        this.f34754d = uuid;
    }

    @Override // v7.c
    public final void b() {
        m7.l lVar = this.f34753c;
        WorkDatabase workDatabase = lVar.f28732d;
        workDatabase.c();
        try {
            c.a(lVar, this.f34754d.toString());
            workDatabase.h();
            workDatabase.f();
            m7.e.a(lVar.f28731c, lVar.f28732d, lVar.f28734f);
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
