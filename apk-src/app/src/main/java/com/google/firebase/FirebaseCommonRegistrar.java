package com.google.firebase;

import android.content.Context;
import android.os.Build;
import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.r;
import e5.g;
import fe.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import md.b;
import md.q;
import wd.c;
import wd.d;
import wd.e;
import wd.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        i iVarA = b.a(fe.b.class);
        iVarA.d(new md.i(2, 0, a.class));
        iVarA.f2119e = new g(15);
        arrayList.add(iVarA.e());
        q qVar = new q(ld.a.class, Executor.class);
        i iVar = new i(c.class, new Class[]{e.class, f.class});
        iVar.d(md.i.a(Context.class));
        iVar.d(md.i.a(fd.g.class));
        iVar.d(new md.i(2, 0, d.class));
        iVar.d(new md.i(1, 1, fe.b.class));
        iVar.d(new md.i(qVar, 1, 0));
        iVar.f2119e = new r(qVar, 2);
        arrayList.add(iVar.e());
        arrayList.add(rl.b.f("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(rl.b.f("fire-core", "22.0.1"));
        arrayList.add(rl.b.f("device-name", a(Build.PRODUCT)));
        arrayList.add(rl.b.f("device-model", a(Build.DEVICE)));
        arrayList.add(rl.b.f("device-brand", a(Build.BRAND)));
        arrayList.add(rl.b.j("android-target-sdk", new g(11)));
        arrayList.add(rl.b.j("android-min-sdk", new g(12)));
        arrayList.add(rl.b.j("android-platform", new g(13)));
        arrayList.add(rl.b.j("android-installer", new g(14)));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(rl.b.f("kotlin", string));
        }
        return arrayList;
    }
}
