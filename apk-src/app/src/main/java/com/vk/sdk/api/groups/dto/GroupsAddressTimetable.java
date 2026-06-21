package com.vk.sdk.api.groups.dto;

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
public final class GroupsAddressTimetable {

    @b("fri")
    @Nullable
    private final GroupsAddressTimetableDay fri;

    @b("mon")
    @Nullable
    private final GroupsAddressTimetableDay mon;

    @b("sat")
    @Nullable
    private final GroupsAddressTimetableDay sat;

    @b("sun")
    @Nullable
    private final GroupsAddressTimetableDay sun;

    @b("thu")
    @Nullable
    private final GroupsAddressTimetableDay thu;

    @b("tue")
    @Nullable
    private final GroupsAddressTimetableDay tue;

    @b("wed")
    @Nullable
    private final GroupsAddressTimetableDay wed;

    public GroupsAddressTimetable() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ GroupsAddressTimetable copy$default(GroupsAddressTimetable groupsAddressTimetable, GroupsAddressTimetableDay groupsAddressTimetableDay, GroupsAddressTimetableDay groupsAddressTimetableDay2, GroupsAddressTimetableDay groupsAddressTimetableDay3, GroupsAddressTimetableDay groupsAddressTimetableDay4, GroupsAddressTimetableDay groupsAddressTimetableDay5, GroupsAddressTimetableDay groupsAddressTimetableDay6, GroupsAddressTimetableDay groupsAddressTimetableDay7, int i, Object obj) {
        if ((i & 1) != 0) {
            groupsAddressTimetableDay = groupsAddressTimetable.fri;
        }
        if ((i & 2) != 0) {
            groupsAddressTimetableDay2 = groupsAddressTimetable.mon;
        }
        if ((i & 4) != 0) {
            groupsAddressTimetableDay3 = groupsAddressTimetable.sat;
        }
        if ((i & 8) != 0) {
            groupsAddressTimetableDay4 = groupsAddressTimetable.sun;
        }
        if ((i & 16) != 0) {
            groupsAddressTimetableDay5 = groupsAddressTimetable.thu;
        }
        if ((i & 32) != 0) {
            groupsAddressTimetableDay6 = groupsAddressTimetable.tue;
        }
        if ((i & 64) != 0) {
            groupsAddressTimetableDay7 = groupsAddressTimetable.wed;
        }
        GroupsAddressTimetableDay groupsAddressTimetableDay8 = groupsAddressTimetableDay6;
        GroupsAddressTimetableDay groupsAddressTimetableDay9 = groupsAddressTimetableDay7;
        GroupsAddressTimetableDay groupsAddressTimetableDay10 = groupsAddressTimetableDay5;
        GroupsAddressTimetableDay groupsAddressTimetableDay11 = groupsAddressTimetableDay3;
        return groupsAddressTimetable.copy(groupsAddressTimetableDay, groupsAddressTimetableDay2, groupsAddressTimetableDay11, groupsAddressTimetableDay4, groupsAddressTimetableDay10, groupsAddressTimetableDay8, groupsAddressTimetableDay9);
    }

    @Nullable
    public final GroupsAddressTimetableDay component1() {
        return this.fri;
    }

    @Nullable
    public final GroupsAddressTimetableDay component2() {
        return this.mon;
    }

    @Nullable
    public final GroupsAddressTimetableDay component3() {
        return this.sat;
    }

    @Nullable
    public final GroupsAddressTimetableDay component4() {
        return this.sun;
    }

    @Nullable
    public final GroupsAddressTimetableDay component5() {
        return this.thu;
    }

    @Nullable
    public final GroupsAddressTimetableDay component6() {
        return this.tue;
    }

    @Nullable
    public final GroupsAddressTimetableDay component7() {
        return this.wed;
    }

    @NotNull
    public final GroupsAddressTimetable copy(@Nullable GroupsAddressTimetableDay groupsAddressTimetableDay, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay2, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay3, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay4, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay5, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay6, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay7) {
        return new GroupsAddressTimetable(groupsAddressTimetableDay, groupsAddressTimetableDay2, groupsAddressTimetableDay3, groupsAddressTimetableDay4, groupsAddressTimetableDay5, groupsAddressTimetableDay6, groupsAddressTimetableDay7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressTimetable)) {
            return false;
        }
        GroupsAddressTimetable groupsAddressTimetable = (GroupsAddressTimetable) obj;
        return Intrinsics.a(this.fri, groupsAddressTimetable.fri) && Intrinsics.a(this.mon, groupsAddressTimetable.mon) && Intrinsics.a(this.sat, groupsAddressTimetable.sat) && Intrinsics.a(this.sun, groupsAddressTimetable.sun) && Intrinsics.a(this.thu, groupsAddressTimetable.thu) && Intrinsics.a(this.tue, groupsAddressTimetable.tue) && Intrinsics.a(this.wed, groupsAddressTimetable.wed);
    }

    @Nullable
    public final GroupsAddressTimetableDay getFri() {
        return this.fri;
    }

    @Nullable
    public final GroupsAddressTimetableDay getMon() {
        return this.mon;
    }

    @Nullable
    public final GroupsAddressTimetableDay getSat() {
        return this.sat;
    }

    @Nullable
    public final GroupsAddressTimetableDay getSun() {
        return this.sun;
    }

    @Nullable
    public final GroupsAddressTimetableDay getThu() {
        return this.thu;
    }

    @Nullable
    public final GroupsAddressTimetableDay getTue() {
        return this.tue;
    }

    @Nullable
    public final GroupsAddressTimetableDay getWed() {
        return this.wed;
    }

    public int hashCode() {
        GroupsAddressTimetableDay groupsAddressTimetableDay = this.fri;
        int iHashCode = (groupsAddressTimetableDay == null ? 0 : groupsAddressTimetableDay.hashCode()) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay2 = this.mon;
        int iHashCode2 = (iHashCode + (groupsAddressTimetableDay2 == null ? 0 : groupsAddressTimetableDay2.hashCode())) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay3 = this.sat;
        int iHashCode3 = (iHashCode2 + (groupsAddressTimetableDay3 == null ? 0 : groupsAddressTimetableDay3.hashCode())) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay4 = this.sun;
        int iHashCode4 = (iHashCode3 + (groupsAddressTimetableDay4 == null ? 0 : groupsAddressTimetableDay4.hashCode())) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay5 = this.thu;
        int iHashCode5 = (iHashCode4 + (groupsAddressTimetableDay5 == null ? 0 : groupsAddressTimetableDay5.hashCode())) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay6 = this.tue;
        int iHashCode6 = (iHashCode5 + (groupsAddressTimetableDay6 == null ? 0 : groupsAddressTimetableDay6.hashCode())) * 31;
        GroupsAddressTimetableDay groupsAddressTimetableDay7 = this.wed;
        return iHashCode6 + (groupsAddressTimetableDay7 != null ? groupsAddressTimetableDay7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GroupsAddressTimetable(fri=" + this.fri + ", mon=" + this.mon + ", sat=" + this.sat + ", sun=" + this.sun + ", thu=" + this.thu + ", tue=" + this.tue + ", wed=" + this.wed + ")";
    }

    public GroupsAddressTimetable(@Nullable GroupsAddressTimetableDay groupsAddressTimetableDay, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay2, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay3, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay4, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay5, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay6, @Nullable GroupsAddressTimetableDay groupsAddressTimetableDay7) {
        this.fri = groupsAddressTimetableDay;
        this.mon = groupsAddressTimetableDay2;
        this.sat = groupsAddressTimetableDay3;
        this.sun = groupsAddressTimetableDay4;
        this.thu = groupsAddressTimetableDay5;
        this.tue = groupsAddressTimetableDay6;
        this.wed = groupsAddressTimetableDay7;
    }

    public /* synthetic */ GroupsAddressTimetable(GroupsAddressTimetableDay groupsAddressTimetableDay, GroupsAddressTimetableDay groupsAddressTimetableDay2, GroupsAddressTimetableDay groupsAddressTimetableDay3, GroupsAddressTimetableDay groupsAddressTimetableDay4, GroupsAddressTimetableDay groupsAddressTimetableDay5, GroupsAddressTimetableDay groupsAddressTimetableDay6, GroupsAddressTimetableDay groupsAddressTimetableDay7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupsAddressTimetableDay, (i & 2) != 0 ? null : groupsAddressTimetableDay2, (i & 4) != 0 ? null : groupsAddressTimetableDay3, (i & 8) != 0 ? null : groupsAddressTimetableDay4, (i & 16) != 0 ? null : groupsAddressTimetableDay5, (i & 32) != 0 ? null : groupsAddressTimetableDay6, (i & 64) != 0 ? null : groupsAddressTimetableDay7);
    }
}
