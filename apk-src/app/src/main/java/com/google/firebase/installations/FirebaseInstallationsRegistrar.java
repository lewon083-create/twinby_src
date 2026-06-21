package com.google.firebase.installations;

import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import fd.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ld.a;
import ld.b;
import md.c;
import md.q;
import nd.j;
import wd.e;
import zd.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new zd.c((g) cVar.a(g.class), cVar.d(e.class), (ExecutorService) cVar.b(new q(a.class, ExecutorService.class)), new j((Executor) cVar.b(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<md.b> getComponents() {
        i iVarA = md.b.a(d.class);
        iVarA.f2116b = LIBRARY_NAME;
        iVarA.d(md.i.a(g.class));
        iVarA.d(new md.i(0, 1, e.class));
        iVarA.d(new md.i(new q(a.class, ExecutorService.class), 1, 0));
        iVarA.d(new md.i(new q(b.class, Executor.class), 1, 0));
        iVarA.f2119e = new yf.a(7);
        md.b bVarE = iVarA.e();
        wd.d dVar = new wd.d();
        i iVarA2 = md.b.a(wd.d.class);
        iVarA2.f2118d = 1;
        iVarA2.f2119e = new md.a(dVar);
        return Arrays.asList(bVarE, iVarA2.e(), rl.b.f(LIBRARY_NAME, "19.0.1"));
    }
}
