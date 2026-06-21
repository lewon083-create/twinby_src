package com.vk.sdk.api.stats.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
import io.sentry.UserFeedback;
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
public final class StatsActivity {

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final Integer comments;

    @b("copies")
    @Nullable
    private final Integer copies;

    @b("hidden")
    @Nullable
    private final Integer hidden;

    @b("likes")
    @Nullable
    private final Integer likes;

    @b("subscribed")
    @Nullable
    private final Integer subscribed;

    @b("unsubscribed")
    @Nullable
    private final Integer unsubscribed;

    public StatsActivity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ StatsActivity copy$default(StatsActivity statsActivity, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = statsActivity.comments;
        }
        if ((i & 2) != 0) {
            num2 = statsActivity.copies;
        }
        if ((i & 4) != 0) {
            num3 = statsActivity.hidden;
        }
        if ((i & 8) != 0) {
            num4 = statsActivity.likes;
        }
        if ((i & 16) != 0) {
            num5 = statsActivity.subscribed;
        }
        if ((i & 32) != 0) {
            num6 = statsActivity.unsubscribed;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        return statsActivity.copy(num, num2, num3, num4, num7, num8);
    }

    @Nullable
    public final Integer component1() {
        return this.comments;
    }

    @Nullable
    public final Integer component2() {
        return this.copies;
    }

    @Nullable
    public final Integer component3() {
        return this.hidden;
    }

    @Nullable
    public final Integer component4() {
        return this.likes;
    }

    @Nullable
    public final Integer component5() {
        return this.subscribed;
    }

    @Nullable
    public final Integer component6() {
        return this.unsubscribed;
    }

    @NotNull
    public final StatsActivity copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        return new StatsActivity(num, num2, num3, num4, num5, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsActivity)) {
            return false;
        }
        StatsActivity statsActivity = (StatsActivity) obj;
        return Intrinsics.a(this.comments, statsActivity.comments) && Intrinsics.a(this.copies, statsActivity.copies) && Intrinsics.a(this.hidden, statsActivity.hidden) && Intrinsics.a(this.likes, statsActivity.likes) && Intrinsics.a(this.subscribed, statsActivity.subscribed) && Intrinsics.a(this.unsubscribed, statsActivity.unsubscribed);
    }

    @Nullable
    public final Integer getComments() {
        return this.comments;
    }

    @Nullable
    public final Integer getCopies() {
        return this.copies;
    }

    @Nullable
    public final Integer getHidden() {
        return this.hidden;
    }

    @Nullable
    public final Integer getLikes() {
        return this.likes;
    }

    @Nullable
    public final Integer getSubscribed() {
        return this.subscribed;
    }

    @Nullable
    public final Integer getUnsubscribed() {
        return this.unsubscribed;
    }

    public int hashCode() {
        Integer num = this.comments;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.copies;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hidden;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.likes;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.subscribed;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.unsubscribed;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.comments;
        Integer num2 = this.copies;
        Integer num3 = this.hidden;
        Integer num4 = this.likes;
        Integer num5 = this.subscribed;
        Integer num6 = this.unsubscribed;
        StringBuilder sbO = om1.o("StatsActivity(comments=", ", copies=", num, num2, ", hidden=");
        a.t(sbO, num3, ", likes=", num4, ", subscribed=");
        sbO.append(num5);
        sbO.append(", unsubscribed=");
        sbO.append(num6);
        sbO.append(")");
        return sbO.toString();
    }

    public StatsActivity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this.comments = num;
        this.copies = num2;
        this.hidden = num3;
        this.likes = num4;
        this.subscribed = num5;
        this.unsubscribed = num6;
    }

    public /* synthetic */ StatsActivity(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6);
    }
}
