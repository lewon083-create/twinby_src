package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0484sd {
    public static ArrayList a() {
        C0054bd c0054bd;
        List<String> listA = C0071c4.l().f23546m.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c0054bd = new C0054bd(str, false);
            } else {
                C0071c4.l().m().f23365b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
                c0054bd = new C0054bd(str, true);
            }
            arrayList.add(c0054bd);
        }
        return arrayList;
    }
}
