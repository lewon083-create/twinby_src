package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class NewsfeedListFull {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15203id;

    @b("no_reposts")
    @Nullable
    private final BaseBoolInt noReposts;

    @b("source_ids")
    @Nullable
    private final List<UserId> sourceIds;

    @b("title")
    @NotNull
    private final String title;

    public NewsfeedListFull(int i, @NotNull String title, @Nullable BaseBoolInt baseBoolInt, @Nullable List<UserId> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15203id = i;
        this.title = title;
        this.noReposts = baseBoolInt;
        this.sourceIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedListFull copy$default(NewsfeedListFull newsfeedListFull, int i, String str, BaseBoolInt baseBoolInt, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = newsfeedListFull.f15203id;
        }
        if ((i10 & 2) != 0) {
            str = newsfeedListFull.title;
        }
        if ((i10 & 4) != 0) {
            baseBoolInt = newsfeedListFull.noReposts;
        }
        if ((i10 & 8) != 0) {
            list = newsfeedListFull.sourceIds;
        }
        return newsfeedListFull.copy(i, str, baseBoolInt, list);
    }

    public final int component1() {
        return this.f15203id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final BaseBoolInt component3() {
        return this.noReposts;
    }

    @Nullable
    public final List<UserId> component4() {
        return this.sourceIds;
    }

    @NotNull
    public final NewsfeedListFull copy(int i, @NotNull String title, @Nullable BaseBoolInt baseBoolInt, @Nullable List<UserId> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new NewsfeedListFull(i, title, baseBoolInt, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedListFull)) {
            return false;
        }
        NewsfeedListFull newsfeedListFull = (NewsfeedListFull) obj;
        return this.f15203id == newsfeedListFull.f15203id && Intrinsics.a(this.title, newsfeedListFull.title) && this.noReposts == newsfeedListFull.noReposts && Intrinsics.a(this.sourceIds, newsfeedListFull.sourceIds);
    }

    public final int getId() {
        return this.f15203id;
    }

    @Nullable
    public final BaseBoolInt getNoReposts() {
        return this.noReposts;
    }

    @Nullable
    public final List<UserId> getSourceIds() {
        return this.sourceIds;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15203id) * 31, 31, this.title);
        BaseBoolInt baseBoolInt = this.noReposts;
        int iHashCode = (iE + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        List<UserId> list = this.sourceIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15203id;
        String str = this.title;
        BaseBoolInt baseBoolInt = this.noReposts;
        List<UserId> list = this.sourceIds;
        StringBuilder sbI = pe.a.i(i, "NewsfeedListFull(id=", ", title=", str, ", noReposts=");
        sbI.append(baseBoolInt);
        sbI.append(", sourceIds=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ NewsfeedListFull(int i, String str, BaseBoolInt baseBoolInt, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : baseBoolInt, (i10 & 8) != 0 ? null : list);
    }
}
