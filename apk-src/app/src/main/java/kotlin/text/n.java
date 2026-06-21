package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends kotlin.collections.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f27569b;

    public n(o oVar) {
        this.f27569b = oVar;
    }

    @Override // kotlin.collections.a
    public final int a() {
        return this.f27569b.f27570a.groupCount() + 1;
    }

    public final MatchGroup c(int i) {
        Matcher matcher = this.f27569b.f27570a;
        IntRange intRangeE = ck.o.e(matcher.start(i), matcher.end(i));
        if (intRangeE.f27526b < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeE);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ek.x(ek.u.e(CollectionsKt.w(kotlin.collections.s.d(this)), new Function1() { // from class: kotlin.text.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f27568b.c(((Integer) obj).intValue());
            }
        }));
    }
}
