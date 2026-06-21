package com.vk.sdk.api.stats.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class StatsSexAge {

    @b("count")
    @Nullable
    private final Integer count;

    @b("count_subscribers")
    @Nullable
    private final Integer countSubscribers;

    @b("reach")
    @Nullable
    private final Integer reach;

    @b("reach_subscribers")
    @Nullable
    private final Integer reachSubscribers;

    @b("value")
    @NotNull
    private final String value;

    public StatsSexAge(@NotNull String value, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.count = num;
        this.reach = num2;
        this.reachSubscribers = num3;
        this.countSubscribers = num4;
    }

    public static /* synthetic */ StatsSexAge copy$default(StatsSexAge statsSexAge, String str, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statsSexAge.value;
        }
        if ((i & 2) != 0) {
            num = statsSexAge.count;
        }
        if ((i & 4) != 0) {
            num2 = statsSexAge.reach;
        }
        if ((i & 8) != 0) {
            num3 = statsSexAge.reachSubscribers;
        }
        if ((i & 16) != 0) {
            num4 = statsSexAge.countSubscribers;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return statsSexAge.copy(str, num, num6, num3, num5);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @Nullable
    public final Integer component3() {
        return this.reach;
    }

    @Nullable
    public final Integer component4() {
        return this.reachSubscribers;
    }

    @Nullable
    public final Integer component5() {
        return this.countSubscribers;
    }

    @NotNull
    public final StatsSexAge copy(@NotNull String value, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new StatsSexAge(value, num, num2, num3, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsSexAge)) {
            return false;
        }
        StatsSexAge statsSexAge = (StatsSexAge) obj;
        return Intrinsics.a(this.value, statsSexAge.value) && Intrinsics.a(this.count, statsSexAge.count) && Intrinsics.a(this.reach, statsSexAge.reach) && Intrinsics.a(this.reachSubscribers, statsSexAge.reachSubscribers) && Intrinsics.a(this.countSubscribers, statsSexAge.countSubscribers);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getCountSubscribers() {
        return this.countSubscribers;
    }

    @Nullable
    public final Integer getReach() {
        return this.reach;
    }

    @Nullable
    public final Integer getReachSubscribers() {
        return this.reachSubscribers;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reach;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reachSubscribers;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.countSubscribers;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        Integer num = this.count;
        Integer num2 = this.reach;
        Integer num3 = this.reachSubscribers;
        Integer num4 = this.countSubscribers;
        StringBuilder sb2 = new StringBuilder("StatsSexAge(value=");
        sb2.append(str);
        sb2.append(", count=");
        sb2.append(num);
        sb2.append(", reach=");
        a.t(sb2, num2, ", reachSubscribers=", num3, ", countSubscribers=");
        return u.m(sb2, num4, ")");
    }

    public /* synthetic */ StatsSexAge(String str, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}
