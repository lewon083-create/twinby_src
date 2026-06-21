package yads;

import io.sentry.protocol.Feedback;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou0 f37629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj f37630b;

    public /* synthetic */ d51() {
        this(new ou0(), new kj());
    }

    public final Set a(List list) {
        Object next;
        RandomAccess randomAccessL;
        m0 m0Var;
        Iterable iterable;
        hi0 hi0Var;
        List list2;
        Object next2;
        this.f37630b.getClass();
        LinkedHashSet linkedHashSetU = CollectionsKt.U(kj.a(list));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((oi) next).f41540a, Feedback.TYPE)) {
                break;
            }
        }
        oi oiVar = (oi) next;
        this.f37629a.getClass();
        if ((oiVar != null ? oiVar.f41542c : null) instanceof ru0) {
            w41 w41Var = ((ru0) oiVar.f41542c).f42726a;
            Collection collectionC = w41Var != null ? kotlin.collections.r.c(w41Var) : kotlin.collections.b0.f27475b;
            kf1 kf1Var = oiVar.f41543d;
            if (kf1Var == null || (list2 = kf1Var.f40181a) == null) {
                m0Var = null;
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.a(((m0) next2).a(), "divkit_adtune")) {
                        break;
                    }
                }
                m0Var = (m0) next2;
            }
            sh0 sh0Var = m0Var instanceof sh0 ? (sh0) m0Var : null;
            if (sh0Var == null || (hi0Var = sh0Var.f42941b) == null || (iterable = hi0Var.f39204d) == null) {
                iterable = kotlin.collections.b0.f27475b;
            }
            randomAccessL = CollectionsKt.L(collectionC, iterable);
        } else {
            randomAccessL = kotlin.collections.b0.f27475b;
        }
        linkedHashSetU.addAll(randomAccessL);
        return linkedHashSetU;
    }

    public d51(ou0 ou0Var, kj kjVar) {
        this.f37629a = ou0Var;
        this.f37630b = kjVar;
    }
}
