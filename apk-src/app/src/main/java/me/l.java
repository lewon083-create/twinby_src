package me;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Excluder f28885a = Excluder.f14917d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28886b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28887c = h.f28874b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f28888d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28889e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28890f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28891g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28892h = 2;
    public final boolean i = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Class cls, o oVar) {
        x xVarC = com.google.gson.internal.bind.k.c(com.google.gson.reflect.a.get((Type) cls), oVar);
        ArrayList arrayList = this.f28889e;
        arrayList.add(xVarC);
        if (oVar instanceof w) {
            arrayList.add(com.google.gson.internal.bind.p.a(com.google.gson.reflect.a.get((Type) cls), (w) oVar));
        }
    }
}
