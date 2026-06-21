package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0183gd extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23935b;

    public C0183gd(@NotNull Y4 y42) {
        super(y42);
        String strB = y42.b().b();
        strB = strB == null ? "empty" : strB;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = C0382oa.k().o().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new Tc(y42, (String) entry.getKey())));
        }
        this.f23935b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NotNull Q5 q5) {
        ArrayList<Pair> arrayList;
        if (this.f22888a.f23300t.c() && ((arrayList = this.f23935b) == null || !arrayList.isEmpty())) {
            for (Pair pair : arrayList) {
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.f27469b;
                Tc tc2 = (Tc) pair.f27470c;
                if (moduleServiceEventHandler.handle(new Wc(tc2.f23015b, tc2.f23014a, new Vc(tc2.f23017d, tc2.f23016c, q5)), q5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
