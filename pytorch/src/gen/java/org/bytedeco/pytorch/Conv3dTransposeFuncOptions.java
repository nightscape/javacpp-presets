// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::nn::functional::ConvTransposeFuncOptions<3>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv3dTransposeFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Conv3dTransposeFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Conv3dTransposeFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv3dTransposeFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Conv3dTransposeFuncOptions position(long position) {
        return (Conv3dTransposeFuncOptions)super.position(position);
    }
    @Override public Conv3dTransposeFuncOptions getPointer(long i) {
        return new Conv3dTransposeFuncOptions((Pointer)this).position(position + i);
    }

  public native @ByRef @NoException Tensor bias();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException LongPointer stride();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException LongPointer padding();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException LongPointer output_padding();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer groups();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException LongPointer dilation();
}