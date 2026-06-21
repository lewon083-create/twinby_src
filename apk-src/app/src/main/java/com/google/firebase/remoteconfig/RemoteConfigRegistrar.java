package com.google.firebase.remoteconfig;

import android.content.Context;
import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.r;
import fd.g;
import ge.l;
import hd.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import jd.b;
import md.c;
import md.q;
import zd.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static l lambda$getComponents$0(q qVar, c cVar) {
        gd.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.b(qVar);
        g gVar = (g) cVar.a(g.class);
        d dVar = (d) cVar.a(d.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f20480a.containsKey("frc")) {
                    aVar.f20480a.put("frc", new gd.c(aVar.f20481b));
                }
                cVar2 = (gd.c) aVar.f20480a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new l(context, scheduledExecutorService, gVar, dVar, cVar2, cVar.d(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<md.b> getComponents() {
        q qVar = new q(ld.b.class, ScheduledExecutorService.class);
        i iVar = new i(l.class, new Class[]{je.a.class});
        iVar.f2116b = LIBRARY_NAME;
        iVar.d(md.i.a(Context.class));
        iVar.d(new md.i(qVar, 1, 0));
        iVar.d(md.i.a(g.class));
        iVar.d(md.i.a(d.class));
        iVar.d(md.i.a(a.class));
        iVar.d(new md.i(0, 1, b.class));
        iVar.f2119e = new r(qVar, 1);
        iVar.g(2);
        return Arrays.asList(iVar.e(), rl.b.f(LIBRARY_NAME, "23.0.1"));
    }
}
