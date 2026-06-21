package com.vk.sdk.api.board.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import java.util.List;
import kotlin.Metadata;
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
public final class BoardGetTopicsResponse {

    @b("can_add_topics")
    @NotNull
    private final BaseBoolInt canAddTopics;

    @b("count")
    private final int count;

    @b("default_order")
    @NotNull
    private final BoardDefaultOrder defaultOrder;

    @b("items")
    @NotNull
    private final List<BoardTopic> items;

    public BoardGetTopicsResponse(int i, @NotNull List<BoardTopic> items, @NotNull BoardDefaultOrder defaultOrder, @NotNull BaseBoolInt canAddTopics) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(defaultOrder, "defaultOrder");
        Intrinsics.checkNotNullParameter(canAddTopics, "canAddTopics");
        this.count = i;
        this.items = items;
        this.defaultOrder = defaultOrder;
        this.canAddTopics = canAddTopics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardGetTopicsResponse copy$default(BoardGetTopicsResponse boardGetTopicsResponse, int i, List list, BoardDefaultOrder boardDefaultOrder, BaseBoolInt baseBoolInt, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = boardGetTopicsResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = boardGetTopicsResponse.items;
        }
        if ((i10 & 4) != 0) {
            boardDefaultOrder = boardGetTopicsResponse.defaultOrder;
        }
        if ((i10 & 8) != 0) {
            baseBoolInt = boardGetTopicsResponse.canAddTopics;
        }
        return boardGetTopicsResponse.copy(i, list, boardDefaultOrder, baseBoolInt);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<BoardTopic> component2() {
        return this.items;
    }

    @NotNull
    public final BoardDefaultOrder component3() {
        return this.defaultOrder;
    }

    @NotNull
    public final BaseBoolInt component4() {
        return this.canAddTopics;
    }

    @NotNull
    public final BoardGetTopicsResponse copy(int i, @NotNull List<BoardTopic> items, @NotNull BoardDefaultOrder defaultOrder, @NotNull BaseBoolInt canAddTopics) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(defaultOrder, "defaultOrder");
        Intrinsics.checkNotNullParameter(canAddTopics, "canAddTopics");
        return new BoardGetTopicsResponse(i, items, defaultOrder, canAddTopics);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsResponse)) {
            return false;
        }
        BoardGetTopicsResponse boardGetTopicsResponse = (BoardGetTopicsResponse) obj;
        return this.count == boardGetTopicsResponse.count && Intrinsics.a(this.items, boardGetTopicsResponse.items) && this.defaultOrder == boardGetTopicsResponse.defaultOrder && this.canAddTopics == boardGetTopicsResponse.canAddTopics;
    }

    @NotNull
    public final BaseBoolInt getCanAddTopics() {
        return this.canAddTopics;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final BoardDefaultOrder getDefaultOrder() {
        return this.defaultOrder;
    }

    @NotNull
    public final List<BoardTopic> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.canAddTopics.hashCode() + ((this.defaultOrder.hashCode() + u.i(this.items, Integer.hashCode(this.count) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<BoardTopic> list = this.items;
        BoardDefaultOrder boardDefaultOrder = this.defaultOrder;
        BaseBoolInt baseBoolInt = this.canAddTopics;
        StringBuilder sbM = a.m(i, "BoardGetTopicsResponse(count=", ", items=", ", defaultOrder=", list);
        sbM.append(boardDefaultOrder);
        sbM.append(", canAddTopics=");
        sbM.append(baseBoolInt);
        sbM.append(")");
        return sbM.toString();
    }
}
