package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0401p4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f24548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Location f24549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f24550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f24551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f24552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f24553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f24554h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, String> f24555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f24556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f24557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f24558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f24559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f24560o;

    public C0401p4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f24547a = str;
        this.f24548b = bool;
        this.f24549c = location;
        this.f24550d = bool2;
        this.f24551e = num;
        this.f24552f = num2;
        this.f24553g = num3;
        this.f24554h = bool3;
        this.i = bool4;
        this.f24555j = map;
        this.f24556k = num4;
        this.f24557l = bool5;
        this.f24558m = bool6;
        this.f24559n = bool7;
        this.f24560o = set;
    }

    public final boolean a(@NonNull C0401p4 c0401p4) {
        return equals(c0401p4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0401p4 mergeFrom(@NonNull C0401p4 c0401p4) {
        return new C0401p4((String) WrapUtils.getOrDefaultNullable(this.f24547a, c0401p4.f24547a), (Boolean) WrapUtils.getOrDefaultNullable(this.f24548b, c0401p4.f24548b), (Location) WrapUtils.getOrDefaultNullable(this.f24549c, c0401p4.f24549c), (Boolean) WrapUtils.getOrDefaultNullable(this.f24550d, c0401p4.f24550d), (Integer) WrapUtils.getOrDefaultNullable(this.f24551e, c0401p4.f24551e), (Integer) WrapUtils.getOrDefaultNullable(this.f24552f, c0401p4.f24552f), (Integer) WrapUtils.getOrDefaultNullable(this.f24553g, c0401p4.f24553g), (Boolean) WrapUtils.getOrDefaultNullable(this.f24554h, c0401p4.f24554h), (Boolean) WrapUtils.getOrDefaultNullable(this.i, c0401p4.i), (Map) WrapUtils.getOrDefaultNullable(this.f24555j, c0401p4.f24555j), (Integer) WrapUtils.getOrDefaultNullable(this.f24556k, c0401p4.f24556k), (Boolean) WrapUtils.getOrDefaultNullable(this.f24557l, c0401p4.f24557l), (Boolean) WrapUtils.getOrDefaultNullable(this.f24558m, c0401p4.f24558m), (Boolean) WrapUtils.getOrDefaultNullable(this.f24559n, c0401p4.f24559n), CollectionUtils.merge(this.f24560o, c0401p4.f24560o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C0401p4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0401p4.class == obj.getClass()) {
            C0401p4 c0401p4 = (C0401p4) obj;
            if (Objects.equals(this.f24547a, c0401p4.f24547a) && Objects.equals(this.f24548b, c0401p4.f24548b) && Objects.equals(this.f24549c, c0401p4.f24549c) && Objects.equals(this.f24550d, c0401p4.f24550d) && Objects.equals(this.f24551e, c0401p4.f24551e) && Objects.equals(this.f24552f, c0401p4.f24552f) && Objects.equals(this.f24553g, c0401p4.f24553g) && Objects.equals(this.f24554h, c0401p4.f24554h) && Objects.equals(this.i, c0401p4.i) && Objects.equals(this.f24555j, c0401p4.f24555j) && Objects.equals(this.f24556k, c0401p4.f24556k) && Objects.equals(this.f24557l, c0401p4.f24557l) && Objects.equals(this.f24558m, c0401p4.f24558m) && Objects.equals(this.f24559n, c0401p4.f24559n) && Objects.equals(this.f24560o, c0401p4.f24560o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f24547a, this.f24548b, this.f24549c, this.f24550d, this.f24551e, this.f24552f, this.f24553g, this.f24554h, this.i, this.f24555j, this.f24556k, this.f24557l, this.f24558m, this.f24559n, this.f24560o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f24547a + "', locationTracking=" + this.f24548b + ", manualLocation=" + this.f24549c + ", firstActivationAsUpdate=" + this.f24550d + ", sessionTimeout=" + this.f24551e + ", maxReportsCount=" + this.f24552f + ", dispatchPeriod=" + this.f24553g + ", logEnabled=" + this.f24554h + ", dataSendingEnabled=" + this.i + ", clidsFromClient=" + this.f24555j + ", maxReportsInDbCount=" + this.f24556k + ", nativeCrashesEnabled=" + this.f24557l + ", revenueAutoTrackingEnabled=" + this.f24558m + ", advIdentifiersTrackingEnabled=" + this.f24559n + ", autoCollectedDataSubscribers=" + this.f24560o + '}';
    }

    public C0401p4(@NonNull CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0401p4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
