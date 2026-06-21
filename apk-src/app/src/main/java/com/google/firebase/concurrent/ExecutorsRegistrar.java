package com.google.firebase.concurrent;

import bf.i;
import com.google.android.gms.internal.measurement.j4;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ld.a;
import ld.c;
import ld.d;
import md.b;
import md.m;
import md.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f14755a = new m(new k(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f14756b = new m(new k(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f14757c = new m(new k(6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f14758d = new m(new k(7));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            j4.e(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n5.b(1), hashSet3);
        q qVar3 = new q(ld.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(ld.b.class, ExecutorService.class), new q(ld.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            j4.e(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new n5.b(2), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            j4.e(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new n5.b(3), hashSet9);
        i iVarB = b.b(new q(d.class, Executor.class));
        iVarB.f2119e = new n5.b(4);
        return Arrays.asList(bVar, bVar2, bVar3, iVarB.e());
    }
}
