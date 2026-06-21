package com.vk.sdk.api.comment.dto;

import a0.u;
import com.vk.sdk.api.wall.dto.WallWallComment;
import gf.a;
import java.util.List;
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
public final class CommentThread {

    @b("can_post")
    @Nullable
    private final Boolean canPost;

    @b("count")
    private final int count;

    @b("groups_can_post")
    @Nullable
    private final Boolean groupsCanPost;

    @b("items")
    @Nullable
    private final List<WallWallComment> items;

    @b("show_reply_button")
    @Nullable
    private final Boolean showReplyButton;

    public CommentThread(int i, @Nullable List<WallWallComment> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.count = i;
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentThread copy$default(CommentThread commentThread, int i, List list, Boolean bool, Boolean bool2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = commentThread.count;
        }
        if ((i10 & 2) != 0) {
            list = commentThread.items;
        }
        if ((i10 & 4) != 0) {
            bool = commentThread.canPost;
        }
        if ((i10 & 8) != 0) {
            bool2 = commentThread.showReplyButton;
        }
        if ((i10 & 16) != 0) {
            bool3 = commentThread.groupsCanPost;
        }
        Boolean bool4 = bool3;
        Boolean bool5 = bool;
        return commentThread.copy(i, list, bool5, bool2, bool4);
    }

    public final int component1() {
        return this.count;
    }

    @Nullable
    public final List<WallWallComment> component2() {
        return this.items;
    }

    @Nullable
    public final Boolean component3() {
        return this.canPost;
    }

    @Nullable
    public final Boolean component4() {
        return this.showReplyButton;
    }

    @Nullable
    public final Boolean component5() {
        return this.groupsCanPost;
    }

    @NotNull
    public final CommentThread copy(int i, @Nullable List<WallWallComment> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        return new CommentThread(i, list, bool, bool2, bool3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentThread)) {
            return false;
        }
        CommentThread commentThread = (CommentThread) obj;
        return this.count == commentThread.count && Intrinsics.a(this.items, commentThread.items) && Intrinsics.a(this.canPost, commentThread.canPost) && Intrinsics.a(this.showReplyButton, commentThread.showReplyButton) && Intrinsics.a(this.groupsCanPost, commentThread.groupsCanPost);
    }

    @Nullable
    public final Boolean getCanPost() {
        return this.canPost;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Boolean getGroupsCanPost() {
        return this.groupsCanPost;
    }

    @Nullable
    public final List<WallWallComment> getItems() {
        return this.items;
    }

    @Nullable
    public final Boolean getShowReplyButton() {
        return this.showReplyButton;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        List<WallWallComment> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canPost;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<WallWallComment> list = this.items;
        Boolean bool = this.canPost;
        Boolean bool2 = this.showReplyButton;
        Boolean bool3 = this.groupsCanPost;
        StringBuilder sbM = a.m(i, "CommentThread(count=", ", items=", ", canPost=", list);
        u.s(sbM, bool, ", showReplyButton=", bool2, ", groupsCanPost=");
        sbM.append(bool3);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ CommentThread(int i, List list, Boolean bool, Boolean bool2, Boolean bool3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : bool3);
    }
}
