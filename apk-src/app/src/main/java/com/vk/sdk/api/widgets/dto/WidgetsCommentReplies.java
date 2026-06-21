package com.vk.sdk.api.widgets.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class WidgetsCommentReplies {

    @b("can_post")
    @Nullable
    private final BaseBoolInt canPost;

    @b("count")
    @Nullable
    private final Integer count;

    @b("replies")
    @Nullable
    private final List<WidgetsCommentRepliesItem> replies;

    public WidgetsCommentReplies() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetsCommentReplies copy$default(WidgetsCommentReplies widgetsCommentReplies, BaseBoolInt baseBoolInt, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = widgetsCommentReplies.canPost;
        }
        if ((i & 2) != 0) {
            num = widgetsCommentReplies.count;
        }
        if ((i & 4) != 0) {
            list = widgetsCommentReplies.replies;
        }
        return widgetsCommentReplies.copy(baseBoolInt, num, list);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.canPost;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @Nullable
    public final List<WidgetsCommentRepliesItem> component3() {
        return this.replies;
    }

    @NotNull
    public final WidgetsCommentReplies copy(@Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable List<WidgetsCommentRepliesItem> list) {
        return new WidgetsCommentReplies(baseBoolInt, num, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentReplies)) {
            return false;
        }
        WidgetsCommentReplies widgetsCommentReplies = (WidgetsCommentReplies) obj;
        return this.canPost == widgetsCommentReplies.canPost && Intrinsics.a(this.count, widgetsCommentReplies.count) && Intrinsics.a(this.replies, widgetsCommentReplies.replies);
    }

    @Nullable
    public final BaseBoolInt getCanPost() {
        return this.canPost;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<WidgetsCommentRepliesItem> getReplies() {
        return this.replies;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.canPost;
        int iHashCode = (baseBoolInt == null ? 0 : baseBoolInt.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<WidgetsCommentRepliesItem> list = this.replies;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseBoolInt baseBoolInt = this.canPost;
        Integer num = this.count;
        List<WidgetsCommentRepliesItem> list = this.replies;
        StringBuilder sb2 = new StringBuilder("WidgetsCommentReplies(canPost=");
        sb2.append(baseBoolInt);
        sb2.append(", count=");
        sb2.append(num);
        sb2.append(", replies=");
        return z.h(sb2, list, ")");
    }

    public WidgetsCommentReplies(@Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable List<WidgetsCommentRepliesItem> list) {
        this.canPost = baseBoolInt;
        this.count = num;
        this.replies = list;
    }

    public /* synthetic */ WidgetsCommentReplies(BaseBoolInt baseBoolInt, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}
