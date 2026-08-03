                        List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], nums[low], nums[high]));
                    }else{
                        high--;
                    }else if(sum > target){
                        low++;
                    if(sum < target){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                        Collections.sort(list);
                        if(!result.contains(list)){
                            result.add(list);
                        }
                        low++;
                        while(low < nums.length && nums[low] == nums[low-1]){
                            low++;
                        }
                    }
                }
            }
        }