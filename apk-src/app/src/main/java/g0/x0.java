package g0;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f19790a = Collections.unmodifiableSet(EnumSet.of(t.f19759e, t.f19760f, t.f19761g, t.f19762h));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f19791b = Collections.unmodifiableSet(EnumSet.of(u.f19769e, u.f19766b));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f19792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f19793d;

    static {
        s sVar = s.f19740f;
        s sVar2 = s.f19739e;
        s sVar3 = s.f19736b;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(sVar, sVar2, sVar3));
        f19792c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(sVar2);
        enumSetCopyOf.remove(sVar3);
        f19793d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
