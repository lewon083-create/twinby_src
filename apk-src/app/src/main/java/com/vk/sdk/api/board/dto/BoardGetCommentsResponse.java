package com.vk.sdk.api.board.dto;

import a0.u;
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
public final class BoardGetCommentsResponse {

    @b("count")
    private final int count;

    @b("items")
    @NotNull
    private final List<BoardTopicComment> items;

    @b("poll")
    @Nullable
    private final BoardTopicPoll poll;

    public BoardGetCommentsResponse(int i, @NotNull List<BoardTopicComment> items, @Nullable BoardTopicPoll boardTopicPoll) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.poll = boardTopicPoll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardGetCommentsResponse copy$default(BoardGetCommentsResponse boardGetCommentsResponse, int i, List list, BoardTopicPoll boardTopicPoll, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = boardGetCommentsResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = boardGetCommentsResponse.items;
        }
        if ((i10 & 4) != 0) {
            boardTopicPoll = boardGetCommentsResponse.poll;
        }
        return boardGetCommentsResponse.copy(i, list, boardTopicPoll);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<BoardTopicComment> component2() {
        return this.items;
    }

    @Nullable
    public final BoardTopicPoll component3() {
        return this.poll;
    }

    @NotNull
    public final BoardGetCommentsResponse copy(int i, @NotNull List<BoardTopicComment> items, @Nullable BoardTopicPoll boardTopicPoll) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new BoardGetCommentsResponse(i, items, boardTopicPoll);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetCommentsResponse)) {
            return false;
        }
        BoardGetCommentsResponse boardGetCommentsResponse = (BoardGetCommentsResponse) obj;
        return this.count == boardGetCommentsResponse.count && Intrinsics.a(this.items, boardGetCommentsResponse.items) && Intrinsics.a(this.poll, boardGetCommentsResponse.poll);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<BoardTopicComment> getItems() {
        return this.items;
    }

    @Nullable
    public final BoardTopicPoll getPoll() {
        return this.poll;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        BoardTopicPoll boardTopicPoll = this.poll;
        return i + (boardTopicPoll == null ? 0 : boardTopicPoll.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<BoardTopicComment> list = this.items;
        BoardTopicPoll boardTopicPoll = this.poll;
        StringBuilder sbM = a.m(i, "BoardGetCommentsResponse(count=", ", items=", ", poll=", list);
        sbM.append(boardTopicPoll);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ BoardGetCommentsResponse(int i, List list, BoardTopicPoll boardTopicPoll, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : boardTopicPoll);
    }
}
