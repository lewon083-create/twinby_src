package fh;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kf implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17579a;

    public kf(sy syVar) {
        this.f17579a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nf deserialize(ParsingContext parsingContext, nf nfVar, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field field = nfVar != null ? nfVar.f17946a : null;
        sy syVar = this.f17579a;
        Field optionalField = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, syVar.I);
        TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
        Field field2 = nfVar != null ? nfVar.f17947b : null;
        Function1<Object, Integer> function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
        Field optionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field2, function1);
        TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
        Field field3 = nfVar != null ? nfVar.f17948c : null;
        Function1<Number, Double> function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
        Field optionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field3, function12, mf.f17843n);
        Field optionalField2 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, nfVar != null ? nfVar.f17949d : null, syVar.f18506q6);
        Field optionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_horizontal", mf.f17839j, allowPropertyOverride, nfVar != null ? nfVar.f17950e : null, v0.f18733v);
        Field optionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "alignment_vertical", mf.f17840k, allowPropertyOverride, nfVar != null ? nfVar.f17951f : null, v0.f18734w);
        Field optionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, typeHelper2, allowPropertyOverride, nfVar != null ? nfVar.f17952g : null, function12, mf.f17844o);
        Field optionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "animation", mf.f17841l, allowPropertyOverride, nfVar != null ? nfVar.f17953h : null, be.A);
        Field optionalListField = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, nfVar != null ? nfVar.i : null, syVar.f18544u1);
        Field optionalListField2 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, A2.f22054g, allowPropertyOverride, nfVar != null ? nfVar.f17954j : null, syVar.G1);
        Field optionalField3 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "border", allowPropertyOverride, nfVar != null ? nfVar.f17955k : null, syVar.M1);
        TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
        Field field4 = nfVar != null ? nfVar.f17956l : null;
        Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
        Field optionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field4, function13, mf.f17845p);
        Field optionalListField3 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, nfVar != null ? nfVar.f17957m : null, syVar.P2);
        Field optionalListField4 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, nfVar != null ? nfVar.f17958n : null, syVar.f18346b3);
        Field optionalField4 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, nfVar != null ? nfVar.f17959o : null, syVar.f18594z3);
        Field optionalListField5 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, nfVar != null ? nfVar.f17960p : null, syVar.I3);
        Field optionalField5 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "height", allowPropertyOverride, nfVar != null ? nfVar.f17961q : null, syVar.U6);
        Field optionalField6 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "id", allowPropertyOverride, nfVar != null ? nfVar.f17962r : null);
        Field optionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, nfVar != null ? nfVar.f17963s : null, function1);
        Field optionalField7 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, nfVar != null ? nfVar.f17964t : null, syVar.f18506q6);
        Field optionalField8 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, nfVar != null ? nfVar.f17965u : null, syVar.f18506q6);
        Field optionalField9 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, nfVar != null ? nfVar.f17966v : null, syVar.f18336a4);
        Field optionalField10 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, nfVar != null ? nfVar.f17967w : null, syVar.K4);
        Field optionalField11 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, nfVar != null ? nfVar.f17968x : null, syVar.Y2);
        Field optionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, nfVar != null ? nfVar.f17969y : null, function12, mf.f17846q);
        Field optionalField12 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, nfVar != null ? nfVar.f17970z : null, syVar.Y2);
        Field optionalField13 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, nfVar != null ? nfVar.A : null);
        Field optionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, nfVar != null ? nfVar.B : null);
        Field optionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, nfVar != null ? nfVar.C : null, function13, mf.f17847r);
        Field optionalListField6 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, nfVar != null ? nfVar.D : null, syVar.f18453l1);
        Field optionalField14 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, nfVar != null ? nfVar.E : null, syVar.O6);
        Field optionalField15 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, nfVar != null ? nfVar.F : null, syVar.f18564w3);
        Field optionalListField7 = JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, nfVar != null ? nfVar.G : null, syVar.P8);
        Field optionalField16 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, nfVar != null ? nfVar.H : null, syVar.S8);
        Field optionalField17 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, nfVar != null ? nfVar.I : null, syVar.V1);
        Field optionalField18 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, nfVar != null ? nfVar.J : null, syVar.A1);
        Field optionalField19 = JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, nfVar != null ? nfVar.K : null, syVar.A1);
        Field field5 = nfVar != null ? nfVar.L : null;
        kv kvVar = kv.f17646g;
        hf hfVar = mf.f17848s;
        Intrinsics.c(hfVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
        return new nf(optionalField, optionalFieldWithExpression, optionalFieldWithExpression2, optionalField2, optionalFieldWithExpression3, optionalFieldWithExpression4, optionalFieldWithExpression5, optionalFieldWithExpression6, optionalListField, optionalListField2, optionalField3, optionalFieldWithExpression7, optionalListField3, optionalListField4, optionalField4, optionalListField5, optionalField5, optionalField6, optionalFieldWithExpression8, optionalField7, optionalField8, optionalField9, optionalField10, optionalField11, optionalFieldWithExpression9, optionalField12, optionalField13, optionalFieldWithExpression10, optionalFieldWithExpression11, optionalListField6, optionalField14, optionalField15, optionalListField7, optionalField16, optionalField17, optionalField18, optionalField19, JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, kvVar, hfVar), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, nfVar != null ? nfVar.M : null, syVar.V8), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, nfVar != null ? nfVar.N : null, syVar.f18352b9), JsonFieldParser.readOptionalFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, mf.f17842m, allowPropertyOverride, nfVar != null ? nfVar.O : null, kv.f17653o), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, nfVar != null ? nfVar.P : null, syVar.f18481n9), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, nfVar != null ? nfVar.Q : null, syVar.f18481n9), JsonFieldParser.readOptionalField(parsingContextRestrictPropertyOverride, jSONObject, "width", allowPropertyOverride, nfVar != null ? nfVar.R : null, syVar.U6));
    }
}
