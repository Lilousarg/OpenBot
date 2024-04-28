package org.openbot.logging;

import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;

public class LogDataUtils {

  public static Message generateIndicatorMessage(int indicator) {
    Message msg = Message.obtain();
    msg.arg1 = indicator;
    msg.what = SensorService.MSG_INDICATOR;
    return msg;
  }

  public static Message generateControlDataMessage(int left, int right) {
    Message msg = Message.obtain();
    msg.arg1 = left;
    msg.arg2 = right;
    msg.what = SensorService.MSG_CONTROL;
    return msg;
  }

  public static Message generateVehicleDataMessage(long timestamp, String data, int type) {
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putLong("timestamp", timestamp);
    bundle.putString("data", data);
    msg.setData(bundle);
    msg.what = type;
    return msg;
  }

  public static Message generateInferenceTimeMessage(long frameNumber, long inferenceTime) {
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putLong("frameNumber", frameNumber);
    bundle.putLong("inferenceTime", inferenceTime);
    msg.setData(bundle);
    msg.what = SensorService.MSG_INFERENCE;
    return msg;
  }

  public static Message generateFrameNumberMessage(long frameNumber) {
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putLong("frameNumber", frameNumber);
    bundle.putLong("timestamp", SystemClock.elapsedRealtimeNanos());
    msg.setData(bundle);
    msg.what = SensorService.MSG_FRAME;
    return msg;
  }

  public static Message generateRewardMessage(long reward){
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putLong("rewardNumber",  reward);
    bundle.putLong("timestamp", SystemClock.elapsedRealtimeNanos());
    msg.setData(bundle);
    msg.what = SensorService.MSG_REWARD;

    return msg;
  }

  /*public static Message generateRewardsArrayMessage(String rewardArray){
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putString("rewardNumber",  rewardArray);
    bundle.putLong("timestamp", SystemClock.elapsedRealtimeNanos());
    msg.setData(bundle);
    msg.what = SensorService.MSG_TOTAL_REWARD;

    return msg;
  }*/

  public static Message generateRLMessage(String info)
  {
    Message msg = Message.obtain();
    Bundle bundle = new Bundle();
    bundle.putString("info", info);
    bundle.putLong("timestamp", SystemClock.elapsedRealtimeNanos());
    msg.setData(bundle);
    msg.what = SensorService.MSG_INFO;

    return msg;
  }
}
