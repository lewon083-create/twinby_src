package yads;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f38448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38449b;

    public fi(ko2 ko2Var, boolean z5) {
        this.f38448a = ko2Var;
        this.f38449b = z5;
    }

    public final void a(ArrayList arrayList) {
        Iterator it;
        Map mapC;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pb2 pb2Var = (pb2) it2.next();
            if (this.f38449b) {
                ij.g gVar = of.f41533a;
                lf lfVar = pb2Var.f41867a;
                Thread thread = new Thread("ApplicationExitInfoDetails");
                it = it2;
                StackTraceElement[] stackTraceElementArr = {new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) of.f41533a.getValue()).format(new Date(lfVar.f40515a)), 0), new StackTraceElement("ExitInfo", "description", lfVar.f40516b, 0), new StackTraceElement("Memory", "pss", of.a(lfVar.f40520f), 0), new StackTraceElement("Memory", "rss", of.a(lfVar.f40521g), 0), new StackTraceElement("Process", "name", lfVar.f40522h, 0), new StackTraceElement("Process", "pid", String.valueOf(lfVar.f40519e), 0), new StackTraceElement("Process", "importance", String.valueOf(lfVar.f40518d), 0), new StackTraceElement("Process", "uid", String.valueOf(lfVar.f40523j), 0), new StackTraceElement("Process", "status", String.valueOf(lfVar.i), 0)};
                Map map = pb2Var.f41868b;
                Pair pair = new Pair(thread, stackTraceElementArr);
                Intrinsics.checkNotNullParameter(map, "<this>");
                Intrinsics.checkNotNullParameter(pair, "pair");
                if (map.isEmpty()) {
                    mapC = kotlin.collections.i0.c(pair);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(thread, stackTraceElementArr);
                    mapC = linkedHashMap;
                }
            } else {
                it = it2;
                mapC = pb2Var.f41868b;
            }
            this.f38448a.reportAnr(mapC);
            it2 = it;
        }
    }
}
