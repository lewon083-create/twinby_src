package com.vk.sdk.api.board.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class BoardTopic {

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final Integer comments;

    @b("created")
    @Nullable
    private final Integer created;

    @b("created_by")
    @Nullable
    private final Integer createdBy;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15149id;

    @b("is_closed")
    @Nullable
    private final BaseBoolInt isClosed;

    @b("is_fixed")
    @Nullable
    private final BaseBoolInt isFixed;

    @b("title")
    @Nullable
    private final String title;

    @b("updated")
    @Nullable
    private final Integer updated;

    @b("updated_by")
    @Nullable
    private final Integer updatedBy;

    public BoardTopic() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ BoardTopic copy$default(BoardTopic boardTopic, Integer num, Integer num2, Integer num3, Integer num4, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = boardTopic.comments;
        }
        if ((i & 2) != 0) {
            num2 = boardTopic.created;
        }
        if ((i & 4) != 0) {
            num3 = boardTopic.createdBy;
        }
        if ((i & 8) != 0) {
            num4 = boardTopic.f15149id;
        }
        if ((i & 16) != 0) {
            baseBoolInt = boardTopic.isClosed;
        }
        if ((i & 32) != 0) {
            baseBoolInt2 = boardTopic.isFixed;
        }
        if ((i & 64) != 0) {
            str = boardTopic.title;
        }
        if ((i & 128) != 0) {
            num5 = boardTopic.updated;
        }
        if ((i & 256) != 0) {
            num6 = boardTopic.updatedBy;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        BaseBoolInt baseBoolInt3 = baseBoolInt2;
        String str2 = str;
        BaseBoolInt baseBoolInt4 = baseBoolInt;
        Integer num9 = num3;
        return boardTopic.copy(num, num2, num9, num4, baseBoolInt4, baseBoolInt3, str2, num7, num8);
    }

    @Nullable
    public final Integer component1() {
        return this.comments;
    }

    @Nullable
    public final Integer component2() {
        return this.created;
    }

    @Nullable
    public final Integer component3() {
        return this.createdBy;
    }

    @Nullable
    public final Integer component4() {
        return this.f15149id;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.isClosed;
    }

    @Nullable
    public final BaseBoolInt component6() {
        return this.isFixed;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @Nullable
    public final Integer component8() {
        return this.updated;
    }

    @Nullable
    public final Integer component9() {
        return this.updatedBy;
    }

    @NotNull
    public final BoardTopic copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable Integer num5, @Nullable Integer num6) {
        return new BoardTopic(num, num2, num3, num4, baseBoolInt, baseBoolInt2, str, num5, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardTopic)) {
            return false;
        }
        BoardTopic boardTopic = (BoardTopic) obj;
        return Intrinsics.a(this.comments, boardTopic.comments) && Intrinsics.a(this.created, boardTopic.created) && Intrinsics.a(this.createdBy, boardTopic.createdBy) && Intrinsics.a(this.f15149id, boardTopic.f15149id) && this.isClosed == boardTopic.isClosed && this.isFixed == boardTopic.isFixed && Intrinsics.a(this.title, boardTopic.title) && Intrinsics.a(this.updated, boardTopic.updated) && Intrinsics.a(this.updatedBy, boardTopic.updatedBy);
    }

    @Nullable
    public final Integer getComments() {
        return this.comments;
    }

    @Nullable
    public final Integer getCreated() {
        return this.created;
    }

    @Nullable
    public final Integer getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public final Integer getId() {
        return this.f15149id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getUpdated() {
        return this.updated;
    }

    @Nullable
    public final Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public int hashCode() {
        Integer num = this.comments;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.created;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.createdBy;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f15149id;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.isClosed;
        int iHashCode5 = (iHashCode4 + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.isFixed;
        int iHashCode6 = (iHashCode5 + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        String str = this.title;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.updated;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.updatedBy;
        return iHashCode8 + (num6 != null ? num6.hashCode() : 0);
    }

    @Nullable
    public final BaseBoolInt isClosed() {
        return this.isClosed;
    }

    @Nullable
    public final BaseBoolInt isFixed() {
        return this.isFixed;
    }

    @NotNull
    public String toString() {
        Integer num = this.comments;
        Integer num2 = this.created;
        Integer num3 = this.createdBy;
        Integer num4 = this.f15149id;
        BaseBoolInt baseBoolInt = this.isClosed;
        BaseBoolInt baseBoolInt2 = this.isFixed;
        String str = this.title;
        Integer num5 = this.updated;
        Integer num6 = this.updatedBy;
        StringBuilder sbO = om1.o("BoardTopic(comments=", ", created=", num, num2, ", createdBy=");
        a.t(sbO, num3, ", id=", num4, ", isClosed=");
        a.s(sbO, baseBoolInt, ", isFixed=", baseBoolInt2, ", title=");
        a.r(num5, str, ", updated=", ", updatedBy=", sbO);
        return u.m(sbO, num6, ")");
    }

    public BoardTopic(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable String str, @Nullable Integer num5, @Nullable Integer num6) {
        this.comments = num;
        this.created = num2;
        this.createdBy = num3;
        this.f15149id = num4;
        this.isClosed = baseBoolInt;
        this.isFixed = baseBoolInt2;
        this.title = str;
        this.updated = num5;
        this.updatedBy = num6;
    }

    public /* synthetic */ BoardTopic(Integer num, Integer num2, Integer num3, Integer num4, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, String str, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : baseBoolInt, (i & 32) != 0 ? null : baseBoolInt2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : num5, (i & 256) != 0 ? null : num6);
    }
}
