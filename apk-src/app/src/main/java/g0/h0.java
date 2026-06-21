package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19578b;

    public /* synthetic */ h0(int i, Object obj) {
        this.f19577a = i;
        this.f19578b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // g0.s1
    public final void a(Object obj) {
        t.p pVar;
        List list;
        switch (this.f19577a) {
            case 0:
                List list2 = (List) obj;
                if (!((i0) this.f19578b).f19602h.get() || (pVar = ((i0) this.f19578b).f19597c) == null) {
                    return;
                }
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list3, 10));
                    Iterator it = list3.iterator();
                    while (true) {
                        list = arrayList;
                        if (it.hasNext()) {
                            arrayList.add(((a0.v) it.next()).a());
                        }
                    }
                } else {
                    list = kotlin.collections.b0.f27475b;
                }
                try {
                    pVar.e(list);
                    LinkedHashSet<String> linkedHashSetA = pVar.a();
                    Intrinsics.checkNotNullExpressionValue(linkedHashSetA, "getAvailableCameraIds(...)");
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(linkedHashSetA, 10));
                    for (String primaryCameraId : linkedHashSetA) {
                        Intrinsics.b(primaryCameraId);
                        Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
                        ArrayList cameraIds = kotlin.collections.s.g(primaryCameraId);
                        Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
                        arrayList2.add(new a0.v(cameraIds, null));
                    }
                    i0 i0Var = (i0) this.f19578b;
                    List listR = CollectionsKt.R((Iterable) i0Var.f19601g);
                    if (arrayList2.equals(listR)) {
                        return;
                    }
                    List list4 = listR;
                    Set setV = CollectionsKt.V(list4);
                    Set setV2 = CollectionsKt.V(arrayList2);
                    Set setC = kotlin.collections.q0.c(setV2, setV);
                    Set setC2 = kotlin.collections.q0.c(setV, setV2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.t.j(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((a0.v) it2.next()).a());
                    }
                    try {
                        Iterator it3 = setC2.iterator();
                        while (it3.hasNext()) {
                            i0Var.c(((a0.v) it3.next()).a());
                        }
                        l0 l0Var = i0Var.f19598d;
                        if (l0Var != null) {
                            com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Updating CameraRepository...");
                            l0Var.a(arrayList4);
                            arrayList3.add(l0Var);
                            com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "CameraRepository updated successfully.");
                        }
                        if (!i0Var.i.isEmpty()) {
                            com.google.android.gms.internal.auth.g.e("CameraPresencePrvdr", "Updating " + i0Var.i.size() + " dependent listeners...");
                            for (l1 l1Var : i0Var.i) {
                                l1Var.a(arrayList4);
                                arrayList3.add(l1Var);
                            }
                        }
                        i0Var.f19601g = arrayList2;
                        Iterator it4 = setC.iterator();
                        while (it4.hasNext()) {
                            i0Var.a(((a0.v) it4.next()).a());
                        }
                        i0Var.b(setC, setC2);
                        return;
                    } catch (Exception e3) {
                        com.google.android.gms.internal.auth.g.l("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e3);
                        ArrayList arrayList5 = new ArrayList(kotlin.collections.t.j(list4, 10));
                        Iterator it5 = list4.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((a0.v) it5.next()).a());
                        }
                        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                        Iterator it6 = new kotlin.collections.n0(arrayList3).iterator();
                        while (true) {
                            kotlin.collections.m0 m0Var = (kotlin.collections.m0) it6;
                            if (!m0Var.f27491b.hasPrevious()) {
                                Iterator it7 = setC2.iterator();
                                while (it7.hasNext()) {
                                    i0Var.a(((a0.v) it7.next()).a());
                                }
                                Iterator it8 = setC.iterator();
                                while (it8.hasNext()) {
                                    i0Var.c(((a0.v) it8.next()).a());
                                }
                                return;
                            }
                            l1 l1Var2 = (l1) m0Var.f27491b.previous();
                            try {
                                l1Var2.a(arrayList5);
                            } catch (Exception e7) {
                                com.google.android.gms.internal.auth.g.l("CameraPresencePrvdr", "Failed to rollback listener: " + l1Var2, e7);
                            }
                        }
                    }
                } catch (Exception e10) {
                    com.google.android.gms.internal.auth.g.l("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e10);
                    a0.u1 u1Var = ((i0) this.f19578b).f19599e;
                    if (u1Var != null) {
                        u1Var.A();
                        return;
                    }
                    return;
                }
                break;
            case 1:
                ((f2.a) this.f19578b).accept(obj);
                return;
            case 2:
                ((x0.b0) this.f19578b).f35529b.P((Boolean) obj);
                return;
            default:
                x0.j jVar = (x0.j) obj;
                x0.k0 k0Var = (x0.k0) this.f19578b;
                if (jVar == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                int i = jVar.f35621a;
                if (k0Var.f35638w == 3) {
                    return;
                }
                com.google.android.gms.internal.auth.g.e("VideoCapture", "Stream info update: old: " + k0Var.f35634s + " new: " + jVar);
                x0.j jVar2 = k0Var.f35634s;
                k0Var.f35634s = jVar;
                n nVar = k0Var.i;
                nVar.getClass();
                int i10 = jVar2.f35621a;
                Set set = x0.j.f35619e;
                if ((!set.contains(Integer.valueOf(i10)) && !set.contains(Integer.valueOf(i)) && i10 != i) || (k0Var.A && jVar2.f35623c != null && jVar.f35623c == null)) {
                    k0Var.O();
                    return;
                }
                int i11 = jVar2.f35621a;
                if ((i11 != -1 && i == -1) || (i11 == -1 && i != -1)) {
                    k0Var.I(k0Var.f35635t, jVar, nVar);
                    Object[] objArr = {k0Var.f35635t.c()};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    k0Var.F(Collections.unmodifiableList(arrayList6));
                    k0Var.r();
                    return;
                }
                if (jVar2.f35622b != jVar.f35622b) {
                    k0Var.I(k0Var.f35635t, jVar, nVar);
                    Object[] objArr2 = {k0Var.f35635t.c()};
                    ArrayList arrayList7 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList7.add(obj3);
                    k0Var.F(Collections.unmodifiableList(arrayList7));
                    Iterator it9 = k0Var.f203b.iterator();
                    while (it9.hasNext()) {
                        ((a0.p2) it9.next()).c(k0Var);
                    }
                    return;
                }
                return;
        }
    }

    @Override // g0.s1
    public final void onError(Throwable t10) {
        switch (this.f19577a) {
            case 0:
                Intrinsics.checkNotNullParameter(t10, "t");
                i0 i0Var = (i0) this.f19578b;
                if (i0Var.f19602h.get()) {
                    com.google.android.gms.internal.auth.g.l("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t10);
                    a0.u1 u1Var = i0Var.f19599e;
                    if (u1Var != null) {
                        u1Var.A();
                    }
                    break;
                }
                break;
            case 1:
                com.google.android.gms.internal.auth.g.l("ObserverToConsumerAdapter", "Unexpected error in Observable", t10);
                break;
            case 2:
                b4.d dVar = ((x0.b0) this.f19578b).f35529b;
                dVar.getClass();
                dVar.P(new m(t10));
                break;
            default:
                com.google.android.gms.internal.auth.g.P("VideoCapture", "Receive onError from StreamState observer", t10);
                break;
        }
    }
}
