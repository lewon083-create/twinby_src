package com.vk.sdk.api.apps.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
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
public final class AppsLeaderboard {

    @b("level")
    @Nullable
    private final Integer level;

    @b("points")
    @Nullable
    private final Integer points;

    @b("score")
    @Nullable
    private final Integer score;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public AppsLeaderboard(@NotNull UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.level = num;
        this.points = num2;
        this.score = num3;
    }

    public static /* synthetic */ AppsLeaderboard copy$default(AppsLeaderboard appsLeaderboard, UserId userId, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = appsLeaderboard.userId;
        }
        if ((i & 2) != 0) {
            num = appsLeaderboard.level;
        }
        if ((i & 4) != 0) {
            num2 = appsLeaderboard.points;
        }
        if ((i & 8) != 0) {
            num3 = appsLeaderboard.score;
        }
        return appsLeaderboard.copy(userId, num, num2, num3);
    }

    @NotNull
    public final UserId component1() {
        return this.userId;
    }

    @Nullable
    public final Integer component2() {
        return this.level;
    }

    @Nullable
    public final Integer component3() {
        return this.points;
    }

    @Nullable
    public final Integer component4() {
        return this.score;
    }

    @NotNull
    public final AppsLeaderboard copy(@NotNull UserId userId, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new AppsLeaderboard(userId, num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLeaderboard)) {
            return false;
        }
        AppsLeaderboard appsLeaderboard = (AppsLeaderboard) obj;
        return Intrinsics.a(this.userId, appsLeaderboard.userId) && Intrinsics.a(this.level, appsLeaderboard.level) && Intrinsics.a(this.points, appsLeaderboard.points) && Intrinsics.a(this.score, appsLeaderboard.score);
    }

    @Nullable
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Integer num = this.level;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.points;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.score;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppsLeaderboard(userId=" + this.userId + ", level=" + this.level + ", points=" + this.points + ", score=" + this.score + ")";
    }

    public /* synthetic */ AppsLeaderboard(UserId userId, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
