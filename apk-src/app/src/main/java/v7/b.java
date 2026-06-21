package v7;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m7.l f34756d;

    public /* synthetic */ b(m7.l lVar, int i) {
        this.f34755c = i;
        this.f34756d = lVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // v7.c
    public final void b() {
        switch (this.f34755c) {
            case 0:
                m7.l lVar = this.f34756d;
                WorkDatabase workDatabase = lVar.f28732d;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().g().iterator();
                    while (it.hasNext()) {
                        c.a(lVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    m7.e.a(lVar.f28731c, lVar.f28732d, lVar.f28734f);
                    return;
                } catch (Throwable th2) {
                    workDatabase.f();
                    throw th2;
                }
            default:
                m7.l lVar2 = this.f34756d;
                WorkDatabase workDatabase2 = lVar2.f28732d;
                workDatabase2.c();
                try {
                    Iterator it2 = workDatabase2.n().f().iterator();
                    while (it2.hasNext()) {
                        c.a(lVar2, (String) it2.next());
                    }
                    workDatabase2.h();
                    workDatabase2.f();
                    return;
                } catch (Throwable th3) {
                    workDatabase2.f();
                    throw th3;
                }
        }
    }
}
