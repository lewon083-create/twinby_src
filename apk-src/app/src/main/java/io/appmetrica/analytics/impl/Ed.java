package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ed implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Dd f22291a = new Dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f22292b = kotlin.collections.j0.g(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NotNull Kd kd2) {
        W5 w52 = new W5();
        w52.f23207f = 1;
        V5 v5 = new V5();
        v5.f23116a = kd2.f22568a;
        Z5 z5 = new Z5();
        Integer num = (Integer) f22292b.get(kd2.f22569b.f22420a);
        if (num != null) {
            z5.f23369a = num.intValue();
        }
        String str = kd2.f22569b.f22421b;
        if (str == null) {
            str = "";
        }
        z5.f23370b = str;
        v5.f23117b = z5;
        w52.f23208g = v5;
        return w52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Kd a(@NotNull W5 w52) {
        throw new UnsupportedOperationException();
    }
}
