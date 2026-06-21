package zd;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f46248c;

    public /* synthetic */ b(c cVar, int i) {
        this.f46247b = i;
        this.f46248c = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        ae.b bVarT;
        ae.b bVarG;
        switch (this.f46247b) {
            case 0:
                this.f46248c.a();
                return;
            case 1:
                c cVar = this.f46248c;
                Object obj = c.f46249m;
                synchronized (obj) {
                    try {
                        fd.g gVar = cVar.f46250a;
                        gVar.a();
                        v vVarH = v.h(gVar.f16758a);
                        try {
                            bVarT = cVar.f46252c.T();
                            if (vVarH != null) {
                                vVarH.y();
                            }
                        } catch (Throwable th2) {
                            if (vVarH != null) {
                                vVarH.y();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i = bVarT.f912b;
                    if (i == 5) {
                        bVarG = cVar.g(bVarT);
                    } else {
                        if (i == 3) {
                            bVarG = cVar.g(bVarT);
                        } else if (!cVar.f46253d.a(bVarT)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarT);
                        }
                    }
                    synchronized (obj) {
                        try {
                            fd.g gVar2 = cVar.f46250a;
                            gVar2.a();
                            v vVarH2 = v.h(gVar2.f16758a);
                            try {
                                cVar.f46252c.M(bVarG);
                                if (vVarH2 != null) {
                                    vVarH2.y();
                                }
                            } catch (Throwable th3) {
                                if (vVarH2 != null) {
                                    vVarH2.y();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.f46259k.size() != 0 && !TextUtils.equals(bVarT.f911a, bVarG.f911a)) {
                                Iterator it = cVar.f46259k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (bVarG.f912b == 4) {
                        String str = bVarG.f911a;
                        synchronized (cVar) {
                            cVar.f46258j = str;
                        }
                    }
                    int i10 = bVarG.f912b;
                    if (i10 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i10 == 2 || i10 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e3) {
                    cVar.h(e3);
                    return;
                }
            default:
                this.f46248c.a();
                return;
        }
    }
}
