package com.vk.sdk.api.prettyCards.dto;

import com.vk.dto.common.id.UserId;
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
public final class PrettyCardsEditResponse {

    @b("card_id")
    @NotNull
    private final String cardId;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    public PrettyCardsEditResponse(@NotNull UserId ownerId, @NotNull String cardId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.ownerId = ownerId;
        this.cardId = cardId;
    }

    public static /* synthetic */ PrettyCardsEditResponse copy$default(PrettyCardsEditResponse prettyCardsEditResponse, UserId userId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = prettyCardsEditResponse.ownerId;
        }
        if ((i & 2) != 0) {
            str = prettyCardsEditResponse.cardId;
        }
        return prettyCardsEditResponse.copy(userId, str);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    @NotNull
    public final String component2() {
        return this.cardId;
    }

    @NotNull
    public final PrettyCardsEditResponse copy(@NotNull UserId ownerId, @NotNull String cardId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return new PrettyCardsEditResponse(ownerId, cardId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsEditResponse)) {
            return false;
        }
        PrettyCardsEditResponse prettyCardsEditResponse = (PrettyCardsEditResponse) obj;
        return Intrinsics.a(this.ownerId, prettyCardsEditResponse.ownerId) && Intrinsics.a(this.cardId, prettyCardsEditResponse.cardId);
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public int hashCode() {
        return this.cardId.hashCode() + (this.ownerId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PrettyCardsEditResponse(ownerId=" + this.ownerId + ", cardId=" + this.cardId + ")";
    }
}
