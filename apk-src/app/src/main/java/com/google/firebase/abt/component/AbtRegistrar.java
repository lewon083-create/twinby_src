package com.google.firebase.abt.component;

import android.content.Context;
import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import hd.a;
import java.util.Arrays;
import java.util.List;
import jd.b;
import md.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.d(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<md.b> getComponents() {
        i iVarA = md.b.a(a.class);
        iVarA.f2116b = LIBRARY_NAME;
        iVarA.d(md.i.a(Context.class));
        iVarA.d(new md.i(0, 1, b.class));
        iVarA.f2119e = new gg.b(6);
        return Arrays.asList(iVarA.e(), rl.b.f(LIBRARY_NAME, "21.1.1"));
    }
}
