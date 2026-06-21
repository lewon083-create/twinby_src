package com.vk.sdk.api.board.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.users.dto.UsersUserMin;
import gf.a;
import java.util.List;
import kotlin.Metadata;
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
public final class BoardGetTopicsExtendedResponse {

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

    @b("profiles")
    @NotNull
    private final List<UsersUserMin> profiles;

    public BoardGetTopicsExtendedResponse(int i, @NotNull List<BoardTopic> items, @NotNull BoardDefaultOrder defaultOrder, @NotNull BaseBoolInt canAddTopics, @NotNull List<UsersUserMin> profiles) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(defaultOrder, "defaultOrder");
        Intrinsics.checkNotNullParameter(canAddTopics, "canAddTopics");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        this.count = i;
        this.items = items;
        this.defaultOrder = defaultOrder;
        this.canAddTopics = canAddTopics;
        this.profiles = profiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoardGetTopicsExtendedResponse copy$default(BoardGetTopicsExtendedResponse boardGetTopicsExtendedResponse, int i, List list, BoardDefaultOrder boardDefaultOrder, BaseBoolInt baseBoolInt, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = boardGetTopicsExtendedResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = boardGetTopicsExtendedResponse.items;
        }
        if ((i10 & 4) != 0) {
            boardDefaultOrder = boardGetTopicsExtendedResponse.defaultOrder;
        }
        if ((i10 & 8) != 0) {
            baseBoolInt = boardGetTopicsExtendedResponse.canAddTopics;
        }
        if ((i10 & 16) != 0) {
            list2 = boardGetTopicsExtendedResponse.profiles;
        }
        List list3 = list2;
        BoardDefaultOrder boardDefaultOrder2 = boardDefaultOrder;
        return boardGetTopicsExtendedResponse.copy(i, list, boardDefaultOrder2, baseBoolInt, list3);
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
    public final List<UsersUserMin> component5() {
        return this.profiles;
    }

    @NotNull
    public final BoardGetTopicsExtendedResponse copy(int i, @NotNull List<BoardTopic> items, @NotNull BoardDefaultOrder defaultOrder, @NotNull BaseBoolInt canAddTopics, @NotNull List<UsersUserMin> profiles) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(defaultOrder, "defaultOrder");
        Intrinsics.checkNotNullParameter(canAddTopics, "canAddTopics");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        return new BoardGetTopicsExtendedResponse(i, items, defaultOrder, canAddTopics, profiles);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsExtendedResponse)) {
            return false;
        }
        BoardGetTopicsExtendedResponse boardGetTopicsExtendedResponse = (BoardGetTopicsExtendedResponse) obj;
        return this.count == boardGetTopicsExtendedResponse.count && Intrinsics.a(this.items, boardGetTopicsExtendedResponse.items) && this.defaultOrder == boardGetTopicsExtendedResponse.defaultOrder && this.canAddTopics == boardGetTopicsExtendedResponse.canAddTopics && Intrinsics.a(this.profiles, boardGetTopicsExtendedResponse.profiles);
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

    @NotNull
    public final List<UsersUserMin> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        return this.profiles.hashCode() + a.f(this.canAddTopics, (this.defaultOrder.hashCode() + u.i(this.items, Integer.hashCode(this.count) * 31, 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<BoardTopic> list = this.items;
        BoardDefaultOrder boardDefaultOrder = this.defaultOrder;
        BaseBoolInt baseBoolInt = this.canAddTopics;
        List<UsersUserMin> list2 = this.profiles;
        StringBuilder sbM = a.m(i, "BoardGetTopicsExtendedResponse(count=", ", items=", ", defaultOrder=", list);
        sbM.append(boardDefaultOrder);
        sbM.append(", canAddTopics=");
        sbM.append(baseBoolInt);
        sbM.append(", profiles=");
        return z.h(sbM, list2, ")");
    }
}
